import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { EmpListComponentsComponent } from './component/emp-list-components/emp-list-components.component';
import { DeptListComponentComponent } from './component/dept-list-component/dept-list-component.component';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './component/welcome/welcome.component';
import { EmpFormComponentComponent } from './component/emp-form-component/emp-form-component.component';
import { FormsModule } from '@angular/forms';
import { DeptFormComponentComponent } from './component/dept-form-component/dept-form-component.component';

const route : Routes =[
  {path : '',component: WelcomeComponent},
  {path : 'employees',component : EmpListComponentsComponent},
  {path : 'departments',component : DeptListComponentComponent},
  {path : 'empform',component: EmpFormComponentComponent},
  {path : 'deptform',component: DeptFormComponentComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponentsComponent,
    DeptListComponentComponent,
    WelcomeComponent,
    EmpFormComponentComponent,
    DeptFormComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(route),
    RouterModule.forChild(route)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
