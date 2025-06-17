let str = prompt("enter a string");

vowels = "aeiou";
let final1 = "";

for(ch of str){

    if(vowels.includes(ch)){

        upper = ch.toUpperCase();
        final1 += upper;
    } else{

        final1 += ch;
    }
}

console.log(final1);