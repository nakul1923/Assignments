function add(a){

    for(i=0;i<a.length;i++){

        a[i] = a[i] * a[i];
    }

    return a;
}


var x = [10,20,30,40,50];

var w = add(x);

console.log("result is "+ w);
console.log(typeOf(w));







// function add(a){

//     for(i=0;i<a.length;i++){

//         a[i] = a[i] * a[i];
//     }
// }


// var x = [10,20,30,40,50];

// var w = add(x);       // if we didnt return in function then it shows undefined

// console.log("result is "+ w);
// console.log(typeOf(w));