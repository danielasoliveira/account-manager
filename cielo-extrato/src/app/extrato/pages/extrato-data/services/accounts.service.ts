import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

import { environment } from 'src/environments/environment';

import { AccountStatement } from 'src/app/shared/models/accountStatement/accountStatement.model';
import { UnprocessableEntityResponse } from 'src/app/shared/models/unprocessableEntityResponse/unprocessableEntityResponse.model';


@Injectable({
  providedIn: 'root',
})
export class AccountsService {
  private env = environment;

  constructor(private _http: HttpClient) {}

  getCurrent(startDate: string, endDate: string): Observable<AccountStatement | UnprocessableEntityResponse> {
    const urlPath = `${this.env.cielo}/cielo/conta/extrato/Current?startDate=${startDate}&endDate=${endDate}`;

    return this._http.get<AccountStatement | UnprocessableEntityResponse>(urlPath);
  }

}
