/*
 * WAP to create product class with attributes pid, pname, pprice, plocation. create setter, getter and constructor in the class. create 5 objects and store them in arraylist...display all products using for each loop and ListIterator.
after that display only those products whose price is above 500.

 */

import java.util.*;

class Product{

    int pid;
    String pname;
    double pprice;
    String plocation;

    Product(int pid, String pname, double pprice, String plocation){

        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.plocation = plocation;
    }

    public String toString(){

        return "Id : " + pid + " Name : " + pname + " Price : " + pprice + " Location : " + plocation;
    }

}

class Main{

    public static void main(String[] args) {
        
        Product p1 = new Product(101, "pencil", 100, "A");
        Product p2 = new Product(102, "pen", 200, "B");
        Product p3 = new Product(103, "sharpner", 300, "C");
        Product p4 = new Product(104, "colors", 600 , "D");
        Product p5 = new Product(105, "ruller", 700, "E");

        ArrayList<Product> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("Printing all the elements with for each loop\n");
        for(Product student:list){

            System.out.println(student);
        }

        System.out.println();

        ListIterator<Product> it = list.listIterator();

        System.out.println("Printing all the elements with ListIterator\n");
        while(it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println();

        System.out.println("Printing all the elements with price more than 500\n");
        for(Product student:list){

            if(student.pprice>500){

                System.out.println(student);
            }
            
        }

        
    }
}