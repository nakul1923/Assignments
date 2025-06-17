// function currying


function add(a){

    function sum(b){

        return a+b;
    }

    return sum;
}

let s = add(10);

console.log(s(200));