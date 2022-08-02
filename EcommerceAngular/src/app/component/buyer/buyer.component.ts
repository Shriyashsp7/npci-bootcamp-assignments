import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-buyer',
  templateUrl: './buyer.component.html',
  styleUrls: ['./buyer.component.css']
})
export class BuyerComponent implements OnInit {
  products : Product[] 
  display: string;
  constructor(private service : ProductServiceService) { }

  ngOnInit(): void {
    this.listOfProduct()
  }

  listOfProduct(){
    this.service.getAllProduct().subscribe(data =>{
      this.products=data
    })
  }
  openModal() {
    this.display = "block";
  }
  onCloseHandled() {
    this.display = "none";
  }
  handleAddToCart(){}

}
