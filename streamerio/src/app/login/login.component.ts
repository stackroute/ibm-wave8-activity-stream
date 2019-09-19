import { Component, OnInit } from '@angular/core';
import {Router,ActivatedRoute} from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';
import { JwtHelperService } from "@auth0/angular-jwt";
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  helper = new JwtHelperService();
  username = '';
  password = '';
  invalidLogin = false;
  returnUrl:string;
  token:'eyJhbGciOiJIUzUxMiJ9.eyJSb2xlIjoiSUJNIiwic3ViIjoidmFubWF0aGlAZ21haWwuY29tIiwiZXhwIjoxNTY4OTAxMTg1LCJpYXQiOjE1Njg4ODMxODV9.JABqobTexbaOlQyhCDSyd-tU3uzwL6jQhsD74b8oBveHN4Dkq1qoNvNkdwdYcXQ1c3htvydEMEiExUOgIMjsrA';
  constructor(
    
    private router: Router,
    private loginservice: AuthenticationService,
    private route:ActivatedRoute
  ) { }
  

  ngOnInit() {
    
    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
  
  }
  

  login() {
    (this.loginservice.login(this.username, this.password).subscribe(
      data => {
        console.log('login successful')
        this.router.navigate(['/home'])
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true

      }
    )
    );
    var decodedToken = this.helper.decodeToken(this.token);
    console.log(decodedToken);
  }

}
