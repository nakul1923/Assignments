function outer(){

    var name = 'abc';

    function inner(){

        console.log("inner function " + name);
    }

    return inner;
}

let x = outer();

x();