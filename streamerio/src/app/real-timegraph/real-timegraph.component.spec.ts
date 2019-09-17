import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RealTimegraphComponent } from './real-timegraph.component';

describe('RealTimegraphComponent', () => {
  let component: RealTimegraphComponent;
  let fixture: ComponentFixture<RealTimegraphComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RealTimegraphComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RealTimegraphComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
