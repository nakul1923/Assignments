let arr = [5,2,2,6,7,4];

for(i=0;i<arr.length;i++){

    flag = 0;
    for(j=i+1;j<arr.length;j++){

        if(arr[i]==arr[j]){

            console.log(arr[i]);
            flag = 1;
            break;
        }
    }

    if(flag==1){

        break;
    }
}