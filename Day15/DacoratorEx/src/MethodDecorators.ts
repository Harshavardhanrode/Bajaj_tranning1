function LogMethod(target: any, propertyKey: string, descriptor: PropertyDescriptor) {
    const original = descriptor.value;

    descriptor.value = function (this: any, ...args: any[]) {
        console.log(`Calling ${propertyKey} with`, args);
        return original.apply(this, args);
    };

    return descriptor;
}


class Calculator {
    @LogMethod
    add(a: number, b: number) {
        return a + b;
    }
}

const calc = new Calculator();
console.log(calc.add(2, 3));