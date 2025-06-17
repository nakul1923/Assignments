// var keyword scope


function welcome(){

    var x = 'deepika';
    console.log(x);
    if(true){

        var age = 30;
    }

    console.log(age);  // here not giver error because var keyword scope is function or global scope
}


welcome();