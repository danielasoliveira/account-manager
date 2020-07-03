import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ErrorModalDetails } from '../../models/error-modal-details.model';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.scss']
})
export class ErrorComponent implements OnInit {
  message: string;
  errorStatus: number;
  errorTitle: string;

  constructor(private dialog: MatDialogRef<ErrorComponent>, @Inject(MAT_DIALOG_DATA) public data: ErrorModalDetails) {}

  ngOnInit() {
    this.message = this.data.message;
    this.errorStatus = this.data.status;

    this.errorTitle = this.data.errorTitle ? this.data.errorTitle : 'TRANSAÇÃO INDISPONIVEL';
  }

  closeModal() {
    this.dialog.close();
  }
}
