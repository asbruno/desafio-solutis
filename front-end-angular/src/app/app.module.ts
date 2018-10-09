import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AnalisesListagemComponent } from './analises-listagem/analises-listagem.component';
import { AnaliseComponent } from './analise/analise.component';
import { AnalisesService } from './analises.service';
import { AnaliseService } from './analise.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AnalisesListagemComponent,
    AnaliseComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [AnalisesService, AnaliseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
