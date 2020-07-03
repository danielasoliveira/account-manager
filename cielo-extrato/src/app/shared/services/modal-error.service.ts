import { Injectable } from '@angular/core';
import { MatDialogRef, MatDialog } from '@angular/material/dialog';

import { ErrorComponent } from '../components/error/error.component';
import { ErrorModalDetails } from '../models/error-modal-details.model';

@Injectable({
  providedIn: 'root',
})
export class ModalErrorService {
  constructor(private _dialog: MatDialog) {}

  openDialogError(errorObj: ErrorModalDetails): MatDialogRef<ErrorComponent, any> {
    return this._dialog.open(ErrorComponent, {
      width: '650px',
      data: errorObj,
    });
  }
}
