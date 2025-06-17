// Higher order function

function hello(name,change){

    return "heyyyy" + change(name);
}

function up(str){

    return str.toUpperCase();
}

function low(str){

    return str.toLowerCase();
}
console.log(hello("deepika",up))


// here hello is the hihger order function because it takes a function(change) as an argument

// up and low are callback functions.a

// this concept allow you to change the behaviour by passing different functions without modifying the main hello function