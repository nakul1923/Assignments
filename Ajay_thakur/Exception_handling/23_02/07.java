/*
 * numbers of ways to find details about unknown exception:-

1. By using an object of java.lang.Exception 
 */

class Main{

    public static void main(String[] args) {
        
        try{
            String s = null;
            int x = s.length();
        } catch(Exception e){

            System.out.println(e);
        }
    }
}