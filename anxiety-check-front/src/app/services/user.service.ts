import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TestResult } from '../model/test-result';

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

checkAnxiety(testResult : TestResult){
  const email = localStorage.getItem('email');
  return this.http.put(`http://localhost:8080/users/check/${email}`, testResult);
}

getDiagnoses(): Observable<any[]>{
  const email = localStorage.getItem('email');
  return this.http.get<any[]>(`http://localhost:8080/users/diagnoses/${email}`);
}

}
