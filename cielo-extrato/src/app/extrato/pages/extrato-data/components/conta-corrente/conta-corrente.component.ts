import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

import { UnprocessableEntityResponse } from 'src/app/shared/models/unprocessableEntityResponse/unprocessableEntityResponse.model';
import { AccountStatement } from 'src/app/shared/models/accountStatement/accountStatement.model';

import { AccountsService } from 'src/app/extrato/pages/extrato-data/services/accounts.service';
import { ModalErrorService } from 'src/app/shared/services/modal-error.service';

import { Subscription } from 'rxjs';

import { Moment } from 'moment';
import * as moment from 'moment';

@Component({
  selector: 'app-conta-corrente',
  templateUrl: './conta-corrente.component.html',
  styleUrls: ['./conta-corrente.component.scss']
})
export class ContaCorrenteComponent implements OnInit, OnDestroy {
  emailSuccess = false;

  loadingRequest = true;

  dateFrom: string;
  dateTo: string;

  statementResponse: AccountStatement;
  noStatementInCurrentAccount = false;

  getCurrentSubs: Subscription = new Subscription();
  getCurrentPdfSubs: Subscription = new Subscription();

  constructor(private _accountsService: AccountsService, private _modalErrorService: ModalErrorService) {}

  ngOnInit() {
  }

  ngOnDestroy() {
    this.getCurrentSubs.unsubscribe();
    this.getCurrentPdfSubs.unsubscribe();
  }

  clean() {
    this.statementResponse = null;
  }

  receiveDates(selected: { startDate: Moment; endDate: Moment }) {
    this.dateFrom = selected.startDate.format('YYYY-MM-DD');
    this.dateTo = selected.endDate.format('YYYY-MM-DD');
  }

  private loadCurrent(startDate: string = '', endDate: string = '') {
    this.loadingRequest = true;

    const date: Date = new Date();
    let momentObject: Moment = moment(date);

    if (endDate === '') {
      endDate = momentObject.format('YYYY-MM-DDT23:59:59.999Z');
    } else {
      endDate = `${endDate}T23:59:59.999Z`;
    }

    if (startDate === '') {
      momentObject = moment(date.setMonth(date.getMonth() - 6));
      startDate = momentObject.format('YYYY-MM-DDT00:00:00.000Z');
    } else {
      startDate = `${startDate}T00:00:00.000Z`;
    }

    this.getCurrentSubs = this._accountsService.getCurrent(startDate.toString(), endDate.toString()).subscribe(
      (currentResponse: AccountStatement | UnprocessableEntityResponse) => {
        this.noStatementInCurrentAccount = false;
        this.statementResponse = currentResponse as AccountStatement;
        this.loadingRequest = false;
      },
      (error: HttpErrorResponse) => {
        this.loadingRequest = false;

        if (error.status === 422) {
          this.statementResponse = null;
          this.noStatementInCurrentAccount = true;
        } else {
          this._modalErrorService.openDialogError({
            message: error.message,
            status: error.status,
          });
        }
      }
    );
  }

  filterCheckingAccount() {
    this.loadCurrent(this.dateFrom, this.dateTo);
  }

}
