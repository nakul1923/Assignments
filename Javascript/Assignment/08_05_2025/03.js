let str = "programming";
let arr = str.split("");
let first;
for(i=0;i<arr.length;i++){

    let ch = arr[i];

    for(j=i+1;j<arr.length;j++){

        if(ch==arr[j]){

            arr.splice(j,1);
        }
    }
}

console.log(arr.join(""));