import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Salesperson } from '../salesperson';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  name : string ="Shriyash";

  s1 : Salesperson= new Salesperson("Ajay ","Patil",40000,30);
  salesPersonList : Salesperson[] =[
    this.s1,
    new Salesperson("Atul","Patel",34000,40),
    new Salesperson("Jeet","Kadam",84000,60),
    
  ]
  formModel : Salesperson = new Salesperson("","",0,0);
  constructor() {
    
   }

  ngOnInit(): void {
    
  }
  onSubmit(salesperson : NgForm){
    console.log(this.formModel)
    this.salesPersonList.push(this.formModel)


  

  }

}
