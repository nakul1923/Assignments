// Nested function

function outer(){

    var name='abc';
    console.log("outer function " + name);

    function inner(){

        var age = 30;
        console.log("inner function" + age);
        console.log("inner function " + name);
    }

    // console.log("inner function "+ age);
    inner();
}

outer();