import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { AnaliseComponent } from './analise/analise.component';
import { AnaliseService } from './analise/analise.service';

@NgModule({
  declarations: [
    AppComponent,
    AnaliseComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AnaliseService],
  bootstrap: [AppComponent, AnaliseComponent]
})
export class AppModule { }
