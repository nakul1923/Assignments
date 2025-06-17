// function currying


function add(a){

    function sum(b){

        function total(c){

            return a+b+c;
        }
        return total;
    }

    return sum;
}

let s = add(10);

let closure = s(200);

console.log(closure(300));