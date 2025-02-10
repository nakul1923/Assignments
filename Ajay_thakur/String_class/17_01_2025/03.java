/*
 * program to implement String class method - equalsIgnoreCase
 * 
 * equalsIgnoreCase method
 */

 class Demo{

    public static void main(String[] args) {
        
        String s1 = "welcome";

        String s2 = "welcome";
        
        boolean s3 = s1.equalsIgnoreCase(s2);

        System.out.println(s3);
    }
}