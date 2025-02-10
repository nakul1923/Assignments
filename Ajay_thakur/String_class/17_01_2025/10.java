/*
 * program to check the diffrence types of String
 */

 class Demo{

    public static void main(String[] args) {
        
       String s1 = new String("abc");
       String s2 = new String("abc");
       String s3 = "abc";
       String s4 = "abc";

       System.out.println(s1==s2);                // it will return false
       System.out.println(s3==s4);                // it will return true
       System.out.println(s1==s3);                // it will return false
    }
}