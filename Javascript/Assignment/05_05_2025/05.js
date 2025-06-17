let s = prompt("Enter any string");

let vowel = "aeiouAEIOU";

let count = 0;

for(let char of s){

    if(!vowel.includes(char)){
        count++;
    }
}

console.log(count);