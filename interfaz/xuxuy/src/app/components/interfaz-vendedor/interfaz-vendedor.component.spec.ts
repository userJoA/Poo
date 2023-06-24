import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfazVendedorComponent } from './interfaz-vendedor.component';

describe('InterfazVendedorComponent', () => {
  let component: InterfazVendedorComponent;
  let fixture: ComponentFixture<InterfazVendedorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InterfazVendedorComponent]
    });
    fixture = TestBed.createComponent(InterfazVendedorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
