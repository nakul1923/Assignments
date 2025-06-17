let str = prompt("enter a string");

arr = str.split(" ");
arr1 = [];

for(el of arr){

    ch = el[0];
    ch1 = el[0].toUpperCase();

    let upper =  el.replace(ch,ch1);
    arr1.push(upper);
}

console.log(arr);
console.log(arr1);

console.log(arr1.join(" "));