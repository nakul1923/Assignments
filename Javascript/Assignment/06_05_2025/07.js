str = "hellol000";

function frequencyChecker(s){

    arr = s.split('');

    for(i=0;i<arr.length;i++){

        let count=1
        let ch = arr[i];

        for(j=i+1;j<arr.length;j++){

            if(arr[j]==ch){

                count++;
                arr.splice(j,1);
            }
        }

        console.log(ch + " = " + count);
    }
}

frequencyChecker(str);