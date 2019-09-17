import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoliticalNDADashBoardComponent } from './political-nda-dash-board.component';

describe('PoliticalNDADashBoardComponent', () => {
  let component: PoliticalNDADashBoardComponent;
  let fixture: ComponentFixture<PoliticalNDADashBoardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoliticalNDADashBoardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoliticalNDADashBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
