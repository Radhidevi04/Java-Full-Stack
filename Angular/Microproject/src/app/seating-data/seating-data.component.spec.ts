import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeatingDataComponent } from './seating-data.component';

describe('SeatingDataComponent', () => {
  let component: SeatingDataComponent;
  let fixture: ComponentFixture<SeatingDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SeatingDataComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SeatingDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
