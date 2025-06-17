function cal(a,b,callback){

    return callback(a,b);
}

function add(x,y){

    return x+y;
}

function multi(x,y){

    return x*y;
}

console.log(cal(5,3,add));

console.log(cal(7,4,multi));