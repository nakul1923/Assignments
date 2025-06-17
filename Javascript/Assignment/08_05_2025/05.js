let str = "Java is fun and powerful";

let arr = str.split(" ");

let final = arr.reduce((shortest, word)=>{

    if(word.length<shortest.length){

        return word;
    } else{

        return shortest;
    }
},arr[0]);

console.log(final);

