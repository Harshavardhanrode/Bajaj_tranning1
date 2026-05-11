import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PaySlip } from './pay-slip/pay-slip';
import { Documentation } from './documentation/documentation';

@NgModule({
  declarations: [PaySlip, Documentation],
  imports: [CommonModule],
})
export class HRModule {}
