let healthyItems = ["apple",'banana','grapes'];

let shopingCart = [];

function addToCart(cart,item){

    cart.push(item);

    return cart;
}

function removeFromCart(cart,item){

    index = cart.indexOf(item);

    cart.splice(index,1);

    return cart;
}

let isHealthy = (item) => {

    return healthyItems.includes(item);

}

function totalCost(cart,taxRate=0.05){

    
}

