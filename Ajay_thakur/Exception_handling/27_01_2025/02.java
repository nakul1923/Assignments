/*
 * Program to implemet throw keyword
 * 
 * part 2
 * 
 */

 class Main{

    public static void main(String[] args) {
        
        try{
            System.out.println("main");

            throw new ArithmeticException("zero issue");
        } catch(ArithmeticException rr){

            System.out.println("exception taken");
        }
        
        System.out.println("end");
    }
}