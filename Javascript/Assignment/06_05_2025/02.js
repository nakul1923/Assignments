let s = prompt("Enter any string");

let vowel = "aeiouAEIOU";

let countVow = 0;
let countCon = 0;

for(let char of s){

    if(vowel.includes(char)){
        countVow++;
    } else if(char>'A' && char<'z' && !vowel.includes(char)){

        countCon++;
    }
}

console.log(countVow);
console.log(countCon);