import { Component, OnInit } from '@angular/core';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import {Employee} from 'src/app/common/employee'
@Component({
  selector: 'app-emp-list-components',
  templateUrl: './emp-list-components.component.html',
  styleUrls: ['./emp-list-components.component.css']
})
export class EmpListComponentsComponent implements OnInit {
  employees: Employee[];
  constructor(private service : ManagementServiceService) { }

  ngOnInit(): void {
    this.listOfEmployees()
  }

  listOfEmployees(){
    this.service.getAllEmployee().subscribe(data=>{
      console.log(data)
      this.employees=data

    })
  }

}
