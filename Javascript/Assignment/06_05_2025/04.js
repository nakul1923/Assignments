let str = "i love coding";

let arr = str.split('');

for(i=0;i<str.length;i++){

    if(arr[i]==" "){

        arr.splice(i,1);
    }
}

console.log(arr.join(''));