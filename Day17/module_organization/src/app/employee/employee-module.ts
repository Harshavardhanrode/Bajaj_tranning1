import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmpList } from './emp-list/emp-list';
import { EmployeeDetails } from './employee-details/employee-details';

@NgModule({
  declarations: [EmpList, EmployeeDetails],
  imports: [CommonModule],
  exports:[EmployeeDetails,EmpList]
})
export class EmployeeModule {}
