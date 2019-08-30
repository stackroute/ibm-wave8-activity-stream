import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home';
import { LoginComponent } from './login';
import { RegisterComponent } from './register';
import { AuthGuard } from './_guards';
import {WelcomeComponent} from './welcome/welcome.component';
const appRoutes: Routes = [
    { path: '', component: HomeComponent, canActivate: [AuthGuard] },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    {path: 'compo',component:WelcomeComponent},
    // otherwise redirect to home
    { path: '**', redirectTo: 'compo' }
];

export const routing = RouterModule.forRoot(appRoutes);