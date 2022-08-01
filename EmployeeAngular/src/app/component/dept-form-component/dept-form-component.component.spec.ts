import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeptFormComponentComponent } from './dept-form-component.component';

describe('DeptFormComponentComponent', () => {
  let component: DeptFormComponentComponent;
  let fixture: ComponentFixture<DeptFormComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeptFormComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeptFormComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
