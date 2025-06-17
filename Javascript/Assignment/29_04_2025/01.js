arr = [3,7,8,9,6,7,3,2];

n = arr.length;

function peak(arr,n){

    for(i=0;i<n;i++){

        if((i==0)&&(arr[i+1]<arr[i])){

            return i;
        } else if((i==n-1)&&(arr[n-1]>arr[i-1])){

            return i;
        } else if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1])){

            return i;
        }
    }

    return -1 ;
}

result =  peak(arr,n);

console.log(result);