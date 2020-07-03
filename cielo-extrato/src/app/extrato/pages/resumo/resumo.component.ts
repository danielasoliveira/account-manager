import { Component, OnInit, OnDestroy } from '@angular/core';
import { ModalErrorService } from 'src/app/shared/services/modal-error.service';


@Component({
  selector: 'app-resumo',
  templateUrl: './resumo.component.html',
  styleUrls: ['./resumo.component.scss']
})
export class ResumoComponent implements OnInit, OnDestroy {
  loadingRequest = true;
  gotErrorOnRequest = false;

  constructor(
    private _modalErrorService: ModalErrorService
  ) {}

  ngOnInit() {
    this.loadSummaryInformations();

  }

  ngOnDestroy() {
  }

  private loadSummaryInformations(): void {
    this.loadingRequest = false;
  }
}
