arr = [9, 4, -2, -1, 5, 0, -5, -3, 2];

let size = arr.length;
let pos = [];
let neg = [];

let final = []

for(el of arr){

    if(el>=0){

        pos.push(el);
    } else{

        neg.push(el);
    }
}

console.log(pos);
console.log(neg);
console.log(arr);
for(i=0;i<size;i++){

    if(i%2==0){
        
        final.push(pos.shift());
    } else{

        final.push(neg.shift());
    }
}

console.log(final);