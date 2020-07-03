import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtratoDataComponent } from './extrato-data.component';

describe('ExtratoDataComponent', () => {
  let component: ExtratoDataComponent;
  let fixture: ComponentFixture<ExtratoDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExtratoDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtratoDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
