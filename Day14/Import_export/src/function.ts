 export function add(a: number, b: number): number {
    return a + b;
 }

 export function execute(callback:(message:string) => void){
    callback('Hello from execute function!');
 }