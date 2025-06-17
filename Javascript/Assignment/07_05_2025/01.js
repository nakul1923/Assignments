let str1 = "listen"
let str2 = "silent"

let arr1 = str1.split("");
let arr2 = str2.split("");

if(arr1.sort().join("")==arr2.sort().join("")){

    console.log("anagram");
} else{

    console.log("not a anagram");
}

