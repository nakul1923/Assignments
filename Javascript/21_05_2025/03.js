function getData(id){

    return new Promise((resolve,reject)=>{

        setTimeout(()=>{
            console.log("data",id);
            resolve("success")
        },2000)
    });
}

console.log("waiting for data 1");

getData(1).then((result)=>{

    console.log("waiting for data 2");
    return getData(2);
}).then((result)=>{

    console.log("waiting for data 3");
    return getData(3);
}).then((result)=>{

    console.log(result);
});