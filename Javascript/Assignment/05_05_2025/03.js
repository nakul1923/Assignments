str = prompt("enter string");
ch = prompt("enter a char");
let count = 0;
for(char of str){

    if(char===ch){

        count++;
    }
}

console.log(count);