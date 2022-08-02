import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Category } from '../common/category';
import { Product } from '../common/product';
import { HttpClient, HttpHeaders } from '@angular/common/http';

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
    saveProduct(product : Product) : Observable<Product>{
      console.log(product)

      const httpOptions ={
        headers : new HttpHeaders({
          'Content-type' : 'application/json',
          'Authorization' : 'auth-token',
          'Access-Control-Allow-Origin' : '*'
        })
      };
      return this.httpClient.post<Product>(this.produrl,product,httpOptions)
      
    }

    saveCategry(category : Category) : Observable<Category>{
      console.log(category)
      const httpOptions ={
        headers : new HttpHeaders({
          'Content-type' : 'application/json',
          'Authorization' : 'auth-token',
          'Access-Control-Allow-Origin' : '*'
        })
      };
      return this.httpClient.post<Category>(this.caturl,category,httpOptions)
      
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