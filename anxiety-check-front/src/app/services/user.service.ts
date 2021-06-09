import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

constructor(private http: HttpClient) {

}

testFunction(){
  console.log("Uslooo");
  return this.http.get("http://localhost:8080/users");
}

}
