import { Component, OnInit } from '@angular/core';
import { AnalisesService } from '../analises.service';

@Component({
  selector: 'app-analises-listagem',
  templateUrl: './analises-listagem.component.html',
  styleUrls: ['./analises-listagem.component.css']
})
export class AnalisesListagemComponent implements OnInit {

  analises:Array<any>;

  constructor(private analisesService:AnalisesService) { }

  ngOnInit() {
    this.listar();
  }

  listar() {
    this.analisesService.listar()
      .subscribe(dados => this.analises = dados);
  }
}
