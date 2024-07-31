import { Injectable } from '@angular/core';

@Injectable()
export class NameServiceService {
  getnameservice(a : number,result : number = 1){
    for(let i=1;i<=a;i++){
       result *= i
    }
    return result
  }
}
