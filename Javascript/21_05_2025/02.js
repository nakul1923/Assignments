function getData(id,katappa){

    setTimeout(()=>{

        console.log("data", id);
        if(katappa){

            katappa();
        }
    },2000);
}

getData(1,()=>{
    getData(2,()=>{
        getData(3)
    })
});
