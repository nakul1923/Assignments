arr1 = [1,2,3,4,5];
arr2 = [2,5,6,7];

function union(arr1,arr2){

    temp = [...arr1];
    
    for(i=0;i<arr2.length;i++){

        if(!temp.includes(arr2[i])){

            temp.push(arr2[i]);
        }
    }

    return temp;
}

console.log(union(arr1,arr2));

