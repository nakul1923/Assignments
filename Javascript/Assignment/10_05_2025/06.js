let arr = [5,5,2,2,6,7,4];


for(el of arr){

    let count = 0;
    for(i=0;i<arr.length;i++){

        if(el==arr[i]){

            count++;

        }
    }

    if(count==1){

        console.log(el);
        break;
    }
}