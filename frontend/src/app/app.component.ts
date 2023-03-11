import { Component } from '@angular/core';
import { UserService, UserModel } from "../../build/openapi";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';

  $users = this.userService.renderAllUsers()
  constructor(private readonly userService : UserService) {}
}
