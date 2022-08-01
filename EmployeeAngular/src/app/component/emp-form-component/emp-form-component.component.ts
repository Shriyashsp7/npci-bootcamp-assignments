import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';

@Component({
  selector: 'app-emp-form-component',
  templateUrl: './emp-form-component.component.html',
  styleUrls: ['./emp-form-component.component.css']
})
export class EmpFormComponentComponent implements OnInit {

  constructor() { }
  formModel = new Employee(0,"","",null,0,0,0,0);
  ngOnInit(): void {
  }

}
