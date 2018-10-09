import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AnalisesService {

  analisesUri = 'http://localhost:8080/analise/listagem';

  constructor(private http:HttpClient) { }

  listar() {
    return this.http.get<any[]>(`${this.analisesUri}`);
  }

}
