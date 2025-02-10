/*
 * Program to implement StringBuffer methods -  append(x)
 * 
 * append(x)
 */

 class Demo{

    public static void main(String[] args) {
        
        StringBuffer str= new StringBuffer("Rashmika");
        str.delete(2,5);
        System.out.println(str);

    }
}