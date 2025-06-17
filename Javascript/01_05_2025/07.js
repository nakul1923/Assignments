// Nested function

function outer(){

    console.log("outer function");

    function inner(){

        console.log("inner function");
    }

    inner();
}

outer();