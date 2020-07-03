import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const EXTRATO = 'extrato';

const routes: Routes = [
  { path: '', redirectTo: EXTRATO, pathMatch: 'full' },
  { path: EXTRATO, loadChildren: './extrato/extrato.module#ExtratoModule' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule],
})
export class AppRoutingModule { }
