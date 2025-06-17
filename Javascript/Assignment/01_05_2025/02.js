function createAccount(initialBalance){

    let balance = initialBalance;

    function deposit(amount){

        balance = balance + amount
        console.log(balance);
    }

    function withdrawAmount(amount){

        balance = balance - amount
        console.log(balance);
    }

    function checkBalance(){

        console.log(balance);
    }

    return {

        deposit,
        withdrawAmount,
        checkBalance
    };
    
}

const user1 = createAccount(10000);

user1.checkBalance();
user1.deposit(5000);
user1.withdrawAmount(2000);