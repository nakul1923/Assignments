/*
 * Program to implement StringBuffer methods -  append(x)
 * 
 * append(x)
 */

class Demo{

    public static void main(String[] args) {
        
        StringBuffer str= new StringBuffer("abc");

        str.append("Welcome");
        str.append(10);
        System.out.println(str);

    }
}