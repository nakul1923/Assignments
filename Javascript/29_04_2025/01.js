// join()

var w = ['hello','world'];

console.log(w.join(','));



// concat()

var a = [1,2];
var b = [3,4];

console.log(a.concat(b));


// every()

var age = [25,34,56,78,22];

var y = age.every(x=>x>=18)

console.log(y);


// some()

var marks = [26,34,78,12];

var y = marks.some(x=>x<17);

console.log(y);