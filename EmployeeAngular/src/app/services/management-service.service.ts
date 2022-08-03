import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Department } from '../common/department';
import { Employee } from '../common/employee';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  empurl="http://localhost:8080/api/emp"
  depturl="http://localhost:8080/api/dept"

  constructor(private  httpClient : HttpClient) { }
    getAllEmployee() : Observable<Employee[]>{
      return this.httpClient.get<GetEmployeeResponse>(this.empurl).pipe(map(response => response._embedded.employees));
    }

    getAllDepartment() : Observable<Department[]>{
      return this.httpClient.get<GetDepartmentResponse>(this.depturl).pipe(map(response => response._embedded.departments));
    }
  
}
interface GetEmployeeResponse{
  _embedded :{
    employees : Employee[]
  }
}

interface GetDepartmentResponse{
  _embedded :{
    departments : Department[]
  }
}
