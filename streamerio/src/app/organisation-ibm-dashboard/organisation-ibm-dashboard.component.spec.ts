import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrganisationIbmDashboardComponent } from './organisation-ibm-dashboard.component';

describe('OrganisationIbmDashboardComponent', () => {
  let component: OrganisationIbmDashboardComponent;
  let fixture: ComponentFixture<OrganisationIbmDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrganisationIbmDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrganisationIbmDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
