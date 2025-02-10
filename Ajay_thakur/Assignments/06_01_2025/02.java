abstract class Payment{

    double amount;
    String transactionId;

    Payment(double amount, String transactionId){

        this.amount = amount;
        this.transactionId = transactionId;
    }

    abstract void processPayment();

    void display(){

        System.out.println("Transaction Id : " + transactionId + "\nAmount : " + amount);
    }
}

class CreditCardPayment extends Payment{

    String cardNumber;

    CreditCardPayment(double amount,String transactionId){

        super(amount, transactionId);
    }

    

    void processPayment(){

        System.out.println("Processing credit card payment for amount: "+ amount);
    }
}

class PaypalPayment extends Payment{

    String paypalId;

    PaypalPayment(double amount,String transactionId){

        super(amount, transactionId);
    }

    void processPayment(){

            System.out.println("Processing Paypal payment for amount: " + amount);
        
    }
}

class Beta{

    public static void main(String[] args) {
        
        Payment obj1 = new CreditCardPayment(1000,"101");

       obj1.processPayment();
       obj1.display();

        Payment obj2 = new PaypalPayment(2000, "201");

        obj2.processPayment();
        obj2.display();
    }

    
}