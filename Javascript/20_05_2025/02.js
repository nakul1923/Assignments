// in this program the output will be 10 and after 3 sec 20 will assign on b.

let a = 10;
let b = 0;

setTimeout(()=>{

    b=20;
},3000);

console.log(a+b);

