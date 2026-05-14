
function LogParameter(target: any, methodName: string, position: number) {
    console.log("Parameter Decorator:", methodName, position);
}

class Calculator1 {
    add(@LogParameter a: number, b: number) {
        return a + b;
    }
}