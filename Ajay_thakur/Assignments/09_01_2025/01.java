/*
 * Payment Gateway Interface
Objective: Create a program to simulate payment processing using different payment methods.
1.
Create an interface PaymentGateway with a method processPayment(double amount).
Implement the interface in classes CreditCardPayment and UPIPayment.
Write a driver class to test the functionality by accepting the payment method from the user and processing the payment.

 */

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