import { Component, OnInit } from '@angular/core';
import { ReceipientserviceService } from '../receipientservice.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  registerData = {}
  submitted=false;

  constructor(private ReceiverService:ReceipientserviceService,
    private router:Router) { }

  ngOnInit() {
  }


  register() {
    console.log(this.registerData);
    this.ReceiverService.saveUserDetails(this.registerData)
    .subscribe(
      response => console.log(response),
      this.router.navigate(['/login']),
      error => console.log(error)
    )
  }

  onItemChange(event){
    console.log(event.target.value);
  }

}
