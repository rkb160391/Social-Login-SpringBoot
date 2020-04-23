import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileComponent } from './component/profile/profile.component';
import { LoginComponent } from './component/login/login.component';
import { HomeComponent } from './component/home/home.component';
import { ActivateGuard } from './authguard/active-guard';


const routes: Routes = [{
  path: 'home',
  component: HomeComponent,
  canActivate: []
}, {
  path: 'profile',
  component: ProfileComponent,
  canActivate: []
}, {
  path: '',
  component: LoginComponent,
  canActivate: []
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
