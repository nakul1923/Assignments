let arr = [1,0,0,1,0,1,1];

for(i=0;i<arr.length-1;i++){

    let sub = [];

   for(j=i;j<arr.length;j++){

        sub.push(arr[j]);
        
        count1 = 0;
        count0 = 0;
        for(k=0;k<sub.length;k++){

           if(sub[k]==0){

                count0++;
           }else{

                count1++;
           }
        }

        if(count0==count1){

            console.log("(" + i + ", " + j + ")");
        }
   }

   
}