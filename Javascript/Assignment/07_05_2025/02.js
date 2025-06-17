let str = "javascript is very beautiful";

let arr = str.split(" ");

// let arr1 = [];

// let rev = "";

// for(el of arr){

//     let arr = el.split("");
//     let revStr = arr.reverse().join("");

//     arr1.push(revStr);
// }

// console.log(arr1.join(" "));




let arr1 = arr.map(el=>el.split("").reverse().join(""));

console.log(arr1.join(" "));