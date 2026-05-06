


// function mylog(target: any) {
//     console.log("mylog decorator called");
//     console.log(target);
// }

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



function LogProperty(target: any, propertyKey: string) {
    console.log("Property Decorator:", propertyKey);
}

class Product {
    @LogProperty
    title: string;

    constructor(t: string) {
        this.title = t;
    }
}
