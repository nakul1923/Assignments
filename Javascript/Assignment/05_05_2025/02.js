str = prompt("enter string");

let count = 0;
for(char of str){

    if(char===" "){

        count++;
    }
}

console.log(count);