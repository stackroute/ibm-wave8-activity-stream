import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { PoliticalNDADashBoardComponent } from './political-nda-dash-board/political-nda-dash-board.component';
import {AuthGuard} from './auth.guard'
import { from } from 'rxjs';
const routes: Routes = [
  {
    path: '', component: LoginComponent
  },
  {
    //path:'home',component:HomeComponent,canActivate: [AuthGuard]
    path: 'home', component: HomeComponent
  },
  {
    path: 'political', component: PoliticalNDADashBoardComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
