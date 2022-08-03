import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';
import { ManagementServiceService } from 'src/app/services/management-service.service';

@Component({
  selector: 'app-dept-list-component',
  templateUrl: './dept-list-component.component.html',
  styleUrls: ['./dept-list-component.component.css']
})
export class DeptListComponentComponent implements OnInit {
  departments: Department[]
  constructor(private service : ManagementServiceService) { }

  ngOnInit(): void {
    this.listOfDepartment()
  }

  listOfDepartment(){
    this.service.getAllDepartment().subscribe(data =>{
      console.log(data)
      this.departments=data
    })
  }

}
