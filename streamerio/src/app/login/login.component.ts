import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';
import { JwtHelperService } from "@auth0/angular-jwt";
import { from } from 'rxjs';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit {
  username = '';
  password = '';
  invalidLogin = false;
  returnUrl: string;
  decode = new JwtHelperService();
  public token_object;
  str;
  role;
  constructor(
    private router: Router,
    private loginservice: AuthenticationService,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {

    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';

  }

  login() {
    (this.loginservice.login(this.username, this.password).subscribe(
      data => {
        console.log(data)
        console.log(this.decode.decodeToken(data.token))
        this.token_object = this.decode.decodeToken(data.token);
        this.str = this.token_object.Role;
        console.log(this.str)
        if (this.str == "IBM") {
          this.router.navigate(['/organisation'])
        } else {
          this.router.navigate(['/political'])
        }
        console.log('login successful')
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true

      }

    )

    );
  }

}
