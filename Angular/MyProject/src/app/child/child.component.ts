import { Component, numberAttribute } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { ɵNoopAnimationStyleNormalizer } from '@angular/animations/browser';
import { NameServiceService } from '../name-service.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
    sum : number;
    sub : number;
    mul : number;
    a : number;
    constructor(private calc : CalculatorService, private name : NameServiceService ){
      this.sum = calc.getAddition(200,400);
      this.sub = calc.getSubtraction(120,60);
      this.mul = calc.getMultiplication(50,50);
      this.a = name.getnameservice(5);
    }
   }

