function fetchData(){

    return new Promise((resolve,reject)=>{

        //delay..
        setTimeout(()=>{
            const success = false;
            if(success){
                
                resolve("bhaiya data aa gaya");
            } else{

                reject("data nahi aaya");
            }
        },2000)
    });
}

fetchData().then(r=>document.write(r)).catch(r=>document.write(r)).finally(()=>{document.write("finally bhi chal gaya")});