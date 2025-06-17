// sorting array

let arr = [45,3,6343,64,45,74,2,6,7,76];

for(let i=0;i<arr.length-1;i++){

    for(let j=i+1;j<arr.length;j++){

        if(arr[i]>arr[j]){

            let temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}


// binary search

num = 64;

start = 0;
end = arr.length-1;

while(start<=end){

    mid = Math.floor((start+end)/2);

    if(arr[mid]==num){

        console.log(mid);
        break;
    } else if(arr[mid]>num){

        end = mid-1;
    } else{
        start = mid+1;
    }
}