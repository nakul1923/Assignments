// Default parameters


function hello(str="rashmika"){

    return "Heyyy " + str;
}


console.log(hello("deepika"));
console.log(hello())




function add(x=100,y=200){

    return x+y;
}

console.log(add(11,22));
console.log(add(11));