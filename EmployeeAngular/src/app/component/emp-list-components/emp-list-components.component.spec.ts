import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpListComponentsComponent } from './emp-list-components.component';

describe('EmpListComponentsComponent', () => {
  let component: EmpListComponentsComponent;
  let fixture: ComponentFixture<EmpListComponentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmpListComponentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmpListComponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
