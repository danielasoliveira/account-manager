import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MAT_DATE_LOCALE } from 'saturn-datepicker';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ErrorComponent } from './shared/components/error/error.component';
import { MatDialogModule } from '@angular/material/dialog';
import { APP_BASE_HREF } from '@angular/common';

export function getBaseHref(): string {
  return '/';
}
@NgModule({
  declarations: [ AppComponent, ErrorComponent],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    MatDialogModule,
  ],
  entryComponents: [ErrorComponent],
  providers: [
    {
      provide: APP_BASE_HREF,
      useFactory: getBaseHref,
    },
    { provide: MAT_DATE_LOCALE, useValue: 'pt-BR' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
