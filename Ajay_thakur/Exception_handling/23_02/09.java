/*
 * numbers of ways to find details about unknown exception:-


3. By using getMessage() method - it is a predefine method which display the nature of the exception

 */

 class Main{

    public static void main(String[] args) {
        
        try{
            String s = null;
            int x = s.length();
        } catch(Exception e){

            System.out.println(e.getMessage());
        }

        System.out.println("done");
    }
}