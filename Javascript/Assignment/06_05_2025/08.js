let pass = "Naku2*";

let size = false;
let lower = false;
let upper = false;
let number = false;
let specialC = false;

if(pass.length>=8 && pass.length<=16){

    size = true;

}

for(ch of pass){

    if((ch>='a'&& ch<='z')){

        lower = true;

    } else if((ch>='A' && ch<='Z')){

        upper = true;
        
    }else if((ch>=0 && ch<=9)){

        number = true;

    } else if(!(ch>='a'&& ch<='z' || ch>='A' && ch<='Z' || ch>=0 && ch<=9 || ch==' ')){

       specialC = true;
    }
}

if(size && upper && lower && number && specialC){

    console.log("valid");
} else{

    console.log("invalid");
}
