let arr1 = [1, 5, 10, 20, 40, 80];
let arr2 = [6, 7, 20, 80, 100];
let arr3 = [3, 4, 15, 20, 30, 70, 80, 120];

let common1 = [];

for(i=0;i<arr1.length;i++){

    for(j=0;j<arr2.length;j++){

        if(arr1[i]==arr2[j]){

            let comm = arr1[i];
            for(k=0;k<arr3.length;k++){

                if(comm==arr3[k]){

                    common1.push(arr1[i]);
                }
            }
        }
    }
}

console.log(common1);
