nums = [1,2,3,4,5,6];

function rotate(arr){
        arr.unshift(arr.pop())    
    return arr;
}
console.log(rotate(nums));