/*
 * 
 * Program to implement cloning 
 * 
 * in this program we are cloning a object 
 * 
 * obj2 is clone of obj1 
 * 
 * and now if we change the data of obj2 it will not affect the data of obj1
 */

 class Main implements Cloneable{

    int i = 10;
    int j = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        
       
        Main obj1 = new Main();

        System.out.println(obj1.i);
        System.out.println(obj1.j);

        
        Main obj2 = (Main)obj1.clone();

        System.out.println(obj2.i);
        System.out.println(obj2.j);

        obj2.i = 999;
        obj2.j = 888;

        System.out.println(obj2.i);               
        System.out.println(obj2.j);

        System.out.println(obj1.i);
        System.out.println(obj1.j);

    }
}