let promise = new Promise((resolve,reject)=>{

    // server call taking time....\

    let flag = true;
    if(flag){

        resolve();
    } else{

        reject();
    }
})

document.write("first");
document.write("second");
promise.then(()=>{

    document.write("promise resolved");
}).catch(()=>{
    document.write("promise rejected");
}).finally(()=>{

    document.write("ye to chalega hi")
})

document.write("Done");