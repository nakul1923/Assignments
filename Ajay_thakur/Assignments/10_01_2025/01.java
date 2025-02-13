/*
 * Objective: Demonstrate the use of both static and default methods in an interface.

Tasks:

Create an interface Calculator with:
A static method add(int a, int b) that returns the sum of two numbers.
A default method subtract(int a, int b) that returns the difference between two numbers.
Implement a class BasicCalculator that uses the Calculator interface.
Write a main method to:
Call the static add() method directly from the interface.
Call the default subtract() method using an object of BasicCalculator.

 */

interface Calculator{

    static int add(int a, int b){

        return a+b;
    }

    default int subtract(int a, int b){

        return a-b;
    }
}

class BasicCalculator implements Calculator{


}

class Main{

    public static void main(String[] args) {
        
        System.out.println(Calculator.add(10,20)); 

        Calculator obj1= new BasicCalculator();

        System.out.println(obj1.subtract(20, 10)); 
    }
}