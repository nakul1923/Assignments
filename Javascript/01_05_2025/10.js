function calculate(){

    var count = 0;

    function inc(){

        count++;
        console.log(count);
    }

    return inc;
}

let x = calculate();

x();

x();
x();