import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RealTimeOrganisationChartComponent } from './real-time-organisation-chart.component';

describe('RealTimeOrganisationChartComponent', () => {
  let component: RealTimeOrganisationChartComponent;
  let fixture: ComponentFixture<RealTimeOrganisationChartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RealTimeOrganisationChartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RealTimeOrganisationChartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
