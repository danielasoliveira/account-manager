import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExtratoDataComponent } from './pages/extrato-data/extrato-data.component';
import { ExtratoComponent } from './extrato.component';
import { ResumoComponent } from './pages/resumo/resumo.component';


const routes: Routes = [
  {
    path: '',
    component: ExtratoComponent,
    children: [
      { path: '', redirectTo: 'summary' },
      { path: 'summary', component: ResumoComponent }, //Resumo
      { path: 'consult-extract-data', component: ExtratoDataComponent }, //Consulta de extrato
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ExtratoRoutingModule { }
