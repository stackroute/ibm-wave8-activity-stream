import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditProfileComponent } from './edit-profile/edit-profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import {AuthGuard} from 'src/app/auth.guard'
import { from } from 'rxjs';
const routes: Routes = [
  {
    path:'',component:HeaderComponent
  },
{
  path:'edit',component:EditProfileComponent
},

{
  path:'register',component:RegistrationComponent
},
{
  path:'login',component:LoginComponent
},
{
  path:'home',component:HomeComponent,canActivate: [AuthGuard]
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
