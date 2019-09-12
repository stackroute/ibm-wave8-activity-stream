import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ReceipientserviceService {
  private _registerUrl = "http://localhost:8000/api/v1/user";

  private saveUser:any;
  private updateUser:any;

  constructor(private http: HttpClient) { }

  saveUserDetails(user) {
    this.saveUser = this.http.post<any>(this._registerUrl,user);
    console.log(this.saveUser);
    return this.saveUser;

  }

  getRecipient(username):any{
   
      return this.http.get('http://localhost:8000/api/v1/user/${username}');
  
  }

  updateUserProfile(updateprofile)
  {

    this.updateUser=this.http.put<any>('http://localhost:8000/api/v1/update/${updateprofile.username}',updateprofile);
    return this.updateUser;
  }

 

}
