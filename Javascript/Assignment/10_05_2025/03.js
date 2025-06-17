let arr = [1,1,1,1];

k = 2;
count = 0;
for(i=0;i<arr.length-1;i++){

    for(j=i+1;j<arr.length;j++){

        if((arr[i]+arr[j])==k){

            count++;
        }
    }
}

console.log(count);