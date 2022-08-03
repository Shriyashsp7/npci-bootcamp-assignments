import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponentComponent } from './component/product-list-component/product-list-component.component';
import { CategoryListComponentComponent } from './component/category-list-component/category-list-component.component';
import { HttpClientModule } from '@angular/common/http';
import {  RouterModule, Routes } from '@angular/router';
import { WelcomeComponentComponent } from './component/welcome-component/welcome-component.component';
import { ProductFormComponentComponent } from './component/product-form-component/product-form-component.component';
import { CategoryFormComponentComponent } from './component/category-form-component/category-form-component.component';


const route : Routes =[
  {path : '',component : WelcomeComponentComponent},
  {path : 'product',component: ProductListComponentComponent},
  {path : 'category',component : CategoryListComponentComponent},
  {path : 'productform',component : ProductFormComponentComponent},
  {path : 'categoryform',component : CategoryFormComponentComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponentComponent,
    CategoryListComponentComponent,
    WelcomeComponentComponent,
    ProductFormComponentComponent,
    CategoryFormComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    // RouterModule.forChild(route)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
