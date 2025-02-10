/*
 * program to implement String class method - compareToIgnoreCase
 * 
 * compareToIgnoreCase method
 */

 class Demo{

    public static void main(String[] args) {
        
        String s1 = "welcome";

        String s2 = "WELCOME";
        
        int s3 = s1.compareToIgnoreCase(s2);

        System.out.println(s3);
    }
}