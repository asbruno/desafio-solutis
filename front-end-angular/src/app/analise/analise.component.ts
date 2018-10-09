import { Component, OnInit } from '@angular/core';
import { AnaliseService } from '../analise.service';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';

@Component({
  selector: 'app-analise',
  templateUrl: './analise.component.html',
  styleUrls: ['./analise.component.css']
})
export class AnaliseComponent implements OnInit {

  analise:any;

  constructor(private analiseService:AnaliseService) { }

  ngOnInit() {
    this.processar();
  }

  processar() {
    this.analiseService.processar()
      .subscribe(dados => this.analise = dados);
  }
}
