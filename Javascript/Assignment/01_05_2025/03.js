function createCounter(){

    let count = 0;

    function increment(value){

        count = count + value
        console.log(count);
    }

    function decrement(value){

        count = count - value;
        console.log(count);
    }

    function reset(){

        count = 0;
        console.log(count);
    }

    function getvalue(){

        console.log(count);
    }

    return{

        increment,decrement,reset,getvalue
    };
}

let counter1 = createCounter();
let counter2 = createCounter();

counter1.increment(5);
counter1.decrement(2);

counter2.getvalue();