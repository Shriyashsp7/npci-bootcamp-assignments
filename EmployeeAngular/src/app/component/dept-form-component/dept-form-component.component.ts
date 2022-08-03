import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';

@Component({
  selector: 'app-dept-form-component',
  templateUrl: './dept-form-component.component.html',
  styleUrls: ['./dept-form-component.component.css']
})
export class DeptFormComponentComponent implements OnInit {

  constructor() { }
  formModel = new Department(0,"","");
  ngOnInit(): void {
  }

}
