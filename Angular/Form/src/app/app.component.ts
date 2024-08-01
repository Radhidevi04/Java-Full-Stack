import { Component } from '@angular/core';
import { employee } from './Model/employee';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee : employee;

  constructor(){
    this.employee  = new employee();
  }
  insertemployee(data:any){
    this.employee.empId = data.empId;
    this.employee.empName = data.empname;
    this.employee.empSalary = data.empSalary;
    alert(data.empId+" "+data.empName+" "+data.empSalary);
  }
}
