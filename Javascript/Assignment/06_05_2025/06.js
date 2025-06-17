let str = "i love$() coding@";

function special(s){

    let count = 0;
    for(i=0;i<s.length;i++){

        let ch = s.charAt(i);

        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9' || ch==' '){

            console.log(ch);
            continue;

        }else{

            console.log(ch);
            count ++;
        }
    }

    if(count>0){

        return `special character present count is ${count}`;
    } else{

        return "no special character present";
    }

    
}

console.log(special(str)) ;