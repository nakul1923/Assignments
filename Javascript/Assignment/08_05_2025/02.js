let str = "nakulnakul3";
let first;
for(i=0;i<str.length;i++){

    let ch = str.charAt(i);

    let count = 0;

    for(j=0;j<str.length;j++){

        if(i==j){

            continue;
        }

        if(ch==str.charAt(j)){

            count++;
        }
    }

    if(count==0){

        first = ch;
        break;
    }

}

console.log(first);