import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent 
{
  flag : boolean;
  vehicles : string[];
  selectedVehicle : string = "";
  myStyle : {};
  myClass : string;

  constructor(){
    this.flag=true;
    this.vehicles = ["Bike","Car", "Auto"];
    this.myStyle = {'width' : '40%' , 'border' : '2px solid green'}
    this.myClass = "MyClass1";
  }
  changeFlag(){
    this.flag = ! this.flag;
  }

  setselectedItem(vec : string){
    this.selectedVehicle = vec;
  }
}
