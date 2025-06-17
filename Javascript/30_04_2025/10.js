// var keyword scope


function welcome(){

    var x = 'deepika';
    console.log(x);
}

console.log(x);   // gives error  x is not define
welcome();