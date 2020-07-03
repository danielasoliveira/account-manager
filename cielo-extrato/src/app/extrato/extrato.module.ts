import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  MatTabsModule,
  MatProgressSpinnerModule,
  MatDatepickerModule,
  MatFormFieldModule,
  MatInputModule,
  MAT_DATE_LOCALE,
  MatNativeDateModule,
} from '@angular/material';
import { MatSelectModule } from '@angular/material/select';
import { RouterModule } from '@angular/router';
import { ExtratoRoutingModule } from './extrato-routing.module';
import { ExtratoDataComponent } from './pages/extrato-data/extrato-data.component';
import { ContaCorrenteComponent } from './pages/extrato-data/components/conta-corrente/conta-corrente.component';

import { ExtratoComponent } from './extrato.component';
import { ResumoComponent } from './pages/resumo/resumo.component';

import { SatDatepickerModule, SatNativeDateModule } from 'saturn-datepicker';
import { NgxDaterangepickerMd } from 'ngx-daterangepicker-material';
import { FormsModule } from '@angular/forms';

import { MatVideoModule } from 'mat-video';
import { SharedModule } from '../shared/shared.module';
import { NgxExtendedPdfViewerModule } from 'ngx-extended-pdf-viewer';

@NgModule({
  declarations: [
    ExtratoComponent,
    ResumoComponent,
    ExtratoDataComponent,
    ContaCorrenteComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    ExtratoRoutingModule,
    SharedModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatInputModule,
    MatTabsModule,
    MatProgressSpinnerModule,
    MatNativeDateModule,
    SatNativeDateModule,
    SatDatepickerModule,
    MatSelectModule,
    FormsModule,
    NgxDaterangepickerMd.forRoot(),
    MatVideoModule,
    NgxExtendedPdfViewerModule,
  ],
  providers: [MatDatepickerModule, { provide: MAT_DATE_LOCALE, useValue: 'pt-BR' }],
})
export class ExtratoModule { }
