interface PaymentGateway  {

    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway{

    public void processPayment(double amount){
    
            System.out.println("Processing payment of " + amount + " through credit card");
        }
}

class UPIPayment implements PaymentGateway{

    public void processPayment(double amount){

        System.out.println("Processing payment of " + amount + " through UPI");
    }
}

class Driver{

    public static void main(String[] args) {
        
        PaymentGateway obj1 = new CreditCardPayment();

        obj1.processPayment(20000);

        PaymentGateway obj2 = new UPIPayment();

        obj2.processPayment(10000);
    }
}