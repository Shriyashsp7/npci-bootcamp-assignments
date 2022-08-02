import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { Product } from 'src/app/common/product';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-product-form-component',
  templateUrl: './product-form-component.component.html',
  styleUrls: ['./product-form-component.component.css']
})
export class ProductFormComponentComponent implements OnInit {
  categories : Category[]
  product : Product = new Product(0,"","","",0,"",0,new Date(),new Date(),0)
  constructor(private service : ProductServiceService,private route :Router) { }

  ngOnInit(): void {
    this.listOfCategories()
  }

  listOfCategories(){
    this.service.getAllCategory().subscribe(data =>{
      this.categories=data
    })
  }
  onSubmit(){
    this.service.saveProduct(this.product).subscribe(()=>{
      this.route.navigateByUrl("/product")
    })
  }

}
