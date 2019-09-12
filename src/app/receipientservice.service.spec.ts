import { TestBed } from '@angular/core/testing';

import { ReceipientserviceService } from './receipientservice.service';

describe('ReceipientserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReceipientserviceService = TestBed.get(ReceipientserviceService);
    expect(service).toBeTruthy();
  });
});
