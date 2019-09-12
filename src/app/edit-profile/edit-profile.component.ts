import { Component, OnInit } from '@angular/core';
import { ReceipientserviceService } from '../receipientservice.service';
import { FormControl } from '@angular/forms';
import {Router} from '@angular/router'
@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {

  editProfile:any={};
  constructor(private UpdateService:ReceipientserviceService,
    private router:Router) { }
  ngOnInit() {
   /*this.UpdateService.getRecipient(u).subscribe(data=>{
      this.editProfile=data;
      console.log(this.editProfile);
      }   
    );  */ 
    }  
  editUser() {
    console.log(this.editProfile);
    this.UpdateService.updateUserProfile(this.editProfile)
    .subscribe(
      response => console.log(response),
      this.router.navigate(['/home']),
      error => console.log(error)
    )
  }

  onItemChange(event){
    console.log(event.target.value);
  }
}
