import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoadingComponent } from './components/loading/loading.component';
import { ErrorMessageComponent } from './components/error-message/error-message.component';


@NgModule({
  imports: [CommonModule],
  declarations: [LoadingComponent, ErrorMessageComponent],
  exports: [LoadingComponent, ErrorMessageComponent],
})
export class SharedModule {}
