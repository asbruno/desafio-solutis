import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalisesListagemComponent } from './analises-listagem.component';

describe('AnalisesListagemComponent', () => {
  let component: AnalisesListagemComponent;
  let fixture: ComponentFixture<AnalisesListagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnalisesListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnalisesListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
