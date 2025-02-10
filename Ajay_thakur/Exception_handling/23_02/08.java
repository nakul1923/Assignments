/*
 * numbers of ways to find details about unknown exception:-

2. By using printStackTrace() method - it is one of the predefined method which is present in java.lang.Throwable class and it is inherited in java.lang.Exception class. it displays the following details:-
1. name of the unknown exception 
2. nature of the message
3. Line number where the exception has taken place
 */

 class Main{

    public static void main(String[] args) {
        
        try{
            String s = null;
            int x = s.length();
        } catch(Exception e){

            e.printStackTrace();
        }

        System.out.println("done");
    }
}