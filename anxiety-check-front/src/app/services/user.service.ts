import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
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
  return this.http.put("http://localhost:8080/users/stressLevel", testResult);
}

}
