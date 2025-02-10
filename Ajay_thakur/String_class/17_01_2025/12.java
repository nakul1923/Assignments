/*
 * Strings are immutable but when we change the value of string it will create a new object in the memory.
 */

 class Demo{

    public static void main(String[] args) {
        
       String str = "hello";

       str = str+"Welcome";

       System.out.println(str);
    }
}