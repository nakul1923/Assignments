/*
 * 
 * analogy before starting clone() method
 */

class Main{

    int i = 10;
    int j = 20;

    public static void main(String[] args) {
        
       
        Main obj1 = new Main();

        System.out.println(obj1.i);
        System.out.println(obj1.j);

        
        Main obj2 = obj1;

        System.out.println(obj2.i);
        System.out.println(obj2.j);

        obj2.i = 999;
        obj2.j = 888;

        System.out.println(obj2.i);                 //here value are changing in obj1 and obj2 bcoz both are the same and obj2 and obj1 are the reference of the data
        System.out.println(obj2.j);

    }
}