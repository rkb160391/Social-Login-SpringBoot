import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: string;
  password: string;
  isLogin: boolean = false;

  fbLogo: string = environment.UI_URL + 'assets/img/fb-logo.png';
  googleLogo: string = environment.UI_URL + 'assets/img/google-logo.png';
  githubLogo: string = environment.UI_URL + 'assets/img/github-logo.png';
  GOOGLE_AUTH_URL: string = '';
  FACEBOOK_AUTH_URL: string = '';
  GITHUB_AUTH_URL: string = '';

  constructor(private router: Router) {
    this.GOOGLE_AUTH_URL = environment.GOOGLE_AUTH_URL;
    this.FACEBOOK_AUTH_URL = environment.FACEBOOK_AUTH_URL;
    this.GITHUB_AUTH_URL = environment.GITHUB_AUTH_URL;
  }
  ngOnInit() {

  }
  login(): void {
    if (this.username == 'admin' && this.password == 'admin') {
      this.isLogin = true;
      this.router.navigate(['/home'], { queryParams: { login: true } });
    } else {
      this.isLogin = false;
      alert("Invalid credentials");
    }
  }
}
