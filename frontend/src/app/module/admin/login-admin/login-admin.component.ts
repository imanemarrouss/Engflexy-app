import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import {Router} from '@angular/router';

import { AuthService } from 'src/app/zynerator/security/Auth.service';
import {environment} from "../../../../environments/environment";


@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.scss']
})
export class LoginAdminComponent implements OnInit {
  loginForm = new FormGroup({
    username:new FormControl('',Validators.required),
    password:new FormControl('',Validators.required)
  })
  constructor(private authService:AuthService,private router: Router) { }

  ngOnInit(): void {
  }
  /*submit(){
    const formValues = this.loginForm.value;
    const username = formValues.username;
    const passowrd = formValues.password;
    this.authService.loginAdmin(username,passowrd);
  }*/
  remainingAttempts: number ;

  submit() {
    const formValues = this.loginForm.value;
    const username = formValues.username;
    const password = formValues.password;
    this.authService.loginAdmin(username, password);
    this.authService.loginResult$.subscribe(loginSuccessful => {
      if (!loginSuccessful) {
        this.remainingAttempts = this.authService.remainingAttempts;
      }
    });
  }





  register(){
    this.router.navigate(['/admin/register']);
  }
}
