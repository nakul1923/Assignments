// Array methods 
// 
//  1. push() - we can use push() method to add elements at end of the array after addition it returns the length of the array.

var a = [10,20,30,40,50];

console.log(a);

console.log(a.push(99))
console.log(a);



// 2. pop() - it is used to remove and return last element of the array.


var b = [10,20,30,40,50];

console.log(b);

console.log(b.pop());
console.log(b);




// 3. unshift() - it is used to add element at beginning of the array and returns lenght.


var c = [10,20,30,40,50];

console.log(c);

console.log(c.unshift(90));
console.log(c);



// 4. shift() - it is used to remove and return first element of the array.


var d = [10,20,30,40,50];

console.log(d);

console.log(d.shift());
console.log(d);



// 5. indexof() - it is used to find index of specified element.

var e = [10,20,30,40,50,40];

console.log(e);

console.log(e.indexOf(40));

// if element is not present then we will get -1.

console.log(e.indexOf("rashmika"));




// 6. slice() - it is used to get part of array. it returns array elements from began index to n-1 index.


var f = [10,20,30,40,50,40,5,356,36454,342];

var x = f.slice(1,6);

console.log(x);

var y = f.slice(40,42);
console.log(y);