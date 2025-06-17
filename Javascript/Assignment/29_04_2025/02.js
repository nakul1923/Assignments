nums = [-5, 7, -3, -4, 9, 10, -1, 11];

function separate(arr){

    positive = [];
    negative = [];

    negative =  arr.filter(el=>el<0);
    positive = arr.filter(el=>el>0);

    return positive.concat(negative)
}

console.log(separate(nums));