str = prompt("enter a string");

result = "";

for(i=0;i<str.length;i++){

    char = str[i];
    if(char==="a"){

        char = "A";
    }else if(char==='i'){

        char = 'I'
    }else if(char==='o'){

        char = 'O'
    }else if(char==='u'){

        char = 'U'
    }else if(char==='u'){

        char = 'U'
    }

    result += char;
}

console.log(result);