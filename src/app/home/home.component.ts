import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import{AuthenticationService} from 'src/app/service/authentication.service'
import {User} from 'src/app/model/user'
import { Subscription } from 'rxjs';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  currentUser: User;
    currentUserSubscription: Subscription;
  constructor(
    private authenticationService: AuthenticationService,
    private router: Router,
  ) { }

  ngOnInit() {
  }
  /*ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
  } */

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
}
}
