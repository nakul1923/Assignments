function fetchData(callback){

    setTimeout(function(){

        console.log('data fetched');
        callback();
    },2000)
}

fetchData(()=>{console.log("processing data")});