/*
 * program to implement try and catch
 */

 class Main{

    public static void main(String[] args) {
        
        System.out.println("main");

        try{

            String s1 = args[0];
            System.out.println("first");
            String s2 = args[1];
            System.out.println("Second");
            int x = Integer.parseInt(s1);
            System.out.println("third");
            int y = Integer.parseInt(s2);
            System.out.println("fourth");
            int z = x/y;
            System.out.println("done");
            }

        catch(ArrayIndexOutOfBoundsException rr){

            System.out.println("Plz enter some values");
        }
        catch(NumberFormatException yy){

            System.out.println("Plz enter integer values");
        }
        catch(ArithmeticException ee){

            System.out.println("Plz do not give zero");
        }

        System.out.println("done");
        
    }
}