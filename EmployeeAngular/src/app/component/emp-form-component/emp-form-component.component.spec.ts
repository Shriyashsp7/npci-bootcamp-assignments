import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpFormComponentComponent } from './emp-form-component.component';

describe('EmpFormComponentComponent', () => {
  let component: EmpFormComponentComponent;
  let fixture: ComponentFixture<EmpFormComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmpFormComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmpFormComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
