import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class AnaliseService {

  analiseUri = 'http://localhost:8080/analise';

  private string:any = '{"string": "akiluopikot"}';

  constructor(private http:HttpClient) { }

  processar() {
    return this.http.post(this.analiseUri, this.string, httpOptions);
  }

}
