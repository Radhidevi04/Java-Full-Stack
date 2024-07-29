import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  txtColor : string;
  imgPath: string
  
  constructor(){
    this.name = "Radhidevi";
    this.age = 21;
    this.email = "radhidevi.kalaiselvan@gmail.com";
    this.txtColor = "red";
    this.imgPath = "/assests/logo2.jpg";
  }

  getAddition(a : number,b:number){
    let sum = a+ b;
    return sum;
  }
  
  changeName(){
    this.name="Kalaiselvan"
  }
  
  changeAge(){
    this.age=54
  }
  changeemail(){
    this.email = "pugalss@gmail.com"
  }
}
