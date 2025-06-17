nums = [1,5,7,1];

k = 6;

function findPair(arr,k){

    count = 0
    for(i=0;i<arr.length-1;i++){

        for(j=i+1;j<arr.length;j++){

            if((arr[i]+arr[j])==k){

                count++;
            }
        }
    }

    return count;
}

console.log(findPair(nums,k));