let arr1 = [1,2,3,4,5];
let arr2 = [1,2,3,6,7];

let arr3 = arr1.concat(arr2);



for(i=0;i<arr3.length;i++){

    el = arr3[i];

    for(j=i+1;j<arr3.length;j++){

        if(el==arr3[j]){

            arr3.splice(j,1);
            j--;
        }
    }
}

console.log(arr3);
console.log(arr3.length);



