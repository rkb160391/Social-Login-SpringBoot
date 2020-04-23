import { Injectable } from "@angular/core";
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class LoginService{

    constructor(private router: Router, private http:HttpClient){  
    }
    login(){
        
    }
}