/*
 * Null pointer exception:-
 */

class Main{

    public static void main(String[] args) {
        
        System.out.println("hello");

        try{

            String str = null;
            int x =str.length();
        } catch(NullPointerException rr){

            System.out.println("String contains null");
        }
        
        System.out.println("done");
    }
}