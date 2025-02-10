/*
 * 
 * we can have multiple catch blocks for the same try block but those multiple catch blocks should be in ascending order of their inheritance hierarchy 
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
        

        catch(ArrayIndexOutOfBoundsException cc,NumberFormatException tt){                    //we cannot write two catch with this type         

            System.out.println("plz enter some values");
        }

        

        System.out.println("done");
        
    }
}