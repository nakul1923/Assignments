let str = "i love coding";

let arr = str.split('');

count = 0;
for(i=0;i<str.length;i++){

    if(arr[i]==" "){

        count++;
    }
}

console.log(count);