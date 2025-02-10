/*
 * program to check equals method on string
 */

 class Demo{

    public static void main(String[] args) {
        
       String s1 = new String("abc");
       String s2 = new String("abc");
       String s3 = "abc";
       String s4 = "abc";


       System.out.println(s1.equals(s2));
         System.out.println(s3.equals(s4));
       System.out.println(s1.equals(s3));
    }
}