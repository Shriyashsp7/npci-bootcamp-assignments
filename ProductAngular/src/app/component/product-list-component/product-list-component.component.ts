import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-product-list-component',
  templateUrl: './product-list-component.component.html',
  styleUrls: ['./product-list-component.component.css']
})
export class ProductListComponentComponent implements OnInit {
  products : Product[]
  constructor(private service : ProductServiceService) { }

  ngOnInit(): void {
    this.listOfProducts()
  }

  listOfProducts(){
    this.service.getAllProduct().subscribe(data =>{
      console.log(data);
      this.products=data
      
    })
  }
}
