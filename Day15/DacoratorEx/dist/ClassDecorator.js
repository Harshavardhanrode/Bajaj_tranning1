"use strict";
// function mylog(target: any) {
//     console.log("mylog decorator called");
//     console.log(target);
// }
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
// @mylog
// class Myclass{
//     constructor(){
//             console.log("Myclass constructor");
//         }
//         }
// // 
// function LogProperty(target: any, context: ClassFieldDecoratorContext) {
//     console.log("LogProperty decorator called");
//     console.log(target);
//     console.log(context);
// }
// class Myclass {
//     @LogProperty
//     myProperty: string;
//     constructor(myProperty: string) {
//         console.log("Myclass constructor");
//         this.myProperty = myProperty;
//     }
// }
function LogProperty(target, propertyKey) {
    console.log("Property Decorator:", propertyKey);
}
class Product {
    constructor(t) {
        this.title = t;
    }
}
__decorate([
    LogProperty
], Product.prototype, "title", void 0);
