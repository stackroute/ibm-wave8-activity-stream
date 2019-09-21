import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { PoliticalNDADashBoardComponent } from './political-nda-dash-board/political-nda-dash-board.component';
import { OrganisationIbmDashboardComponent } from './organisation-ibm-dashboard/organisation-ibm-dashboard.component'
import {AuthGuard} from './auth.guard'
import { from } from 'rxjs';
const routes: Routes = [
  {
    path: '', component: LoginComponent
  },
  {
    path: 'political', component: PoliticalNDADashBoardComponent,canActivate: [AuthGuard]
  },
  {
    path: 'organisation', component: OrganisationIbmDashboardComponent,canActivate: [AuthGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
