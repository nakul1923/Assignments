// let keyword

function welcome(){

    let x = 'deepika';
    console.log(x);
    if(true){

        let age = 30;
    }

    console.log(age);  // gives error because let keyword has block scope
}

console.log(x) // gives error

welcome();