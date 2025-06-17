let str = prompt("enter a string");
vowels = "aeiouAEIOU";
let count = 0;
for(ch of str){

    if((ch>='a' && ch<='z' || ch>='A' && ch<='Z') && !vowels.includes(ch)){

        count++;
    }
}

console.log("total consonent is " + count);