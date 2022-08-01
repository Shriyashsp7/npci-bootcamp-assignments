import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Category } from '../common/category';
import { Product } from '../common/product';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  produrl="http://localhost:8080/api/prod"
  caturl="http://localhost:8080/api/cat"

  constructor(private  httpClient : HttpClient) { }
    getAllProduct() : Observable<Product[]>{
      return this.httpClient.get<GetProductResponse>(this.produrl).pipe(map(response => response._embedded.products));
    }

    getAllCategory() : Observable<Category[]>{
      return this.httpClient.get<GetCategoryResponse>(this.caturl).pipe(map(response => response._embedded.categories));
    }
  
}
interface GetProductResponse{
  _embedded :{
    products : Product[]
  }
}

interface GetCategoryResponse{
  _embedded :{
    categories : Category[]
  }
}