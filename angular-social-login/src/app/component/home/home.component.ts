import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { environment, API_BASE_URL } from 'src/environments/environment';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  sub: any;
  authToken: any;
  constructor(private route: ActivatedRoute,
    private router: Router, private httpClient: HttpClient) { }

  ngOnInit(): void {
    this.sub = this.route.queryParams.subscribe(params => {
      // Defaults to 0 if no query param provided.
      this.authToken = +params[0];
      console.log("Token : " + JSON.stringify(params));
    });
    this.getCurrentUser();

  }
  ngOnDestroy() {
    this.sub.unsubscribe();
  }
  getCurrentUser() {
    return this.httpClient.get(API_BASE_URL + "/user/me").subscribe(data=>{
      console.log("USER :"+JSON.stringify(data));
    });
  }

}
