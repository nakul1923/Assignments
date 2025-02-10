/*
 * Program to implement StringBuffer methods -  insert(i,x)
 * 
 * insert(i,x)
 */

 class Demo{

    public static void main(String[] args) {
        
        StringBuffer str= new StringBuffer("abc");

        str.append("Welcome");
        str.insert(1,"hello");
        System.out.println(str);

    }
}