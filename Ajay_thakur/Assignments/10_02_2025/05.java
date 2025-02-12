/*
 *  WAP to read product details like PID,Pname,pprice and store them in Vector..Read number of products and all details from user..display all products using foreach,iterator,listiterator and enumeration.
 */


import java.util.*;

class Product{

    String name;
    int id;
    double price;
    
    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}

class Main{

    public static void main(String[] args) {
        
        Vector<Product> v = new Vector<>();

        Product p1 = new Product("Pencil", 101, 100);
        Product p2 = new Product("Earesar", 102, 200);
        Product p3 = new Product("sharpner", 103, 300);

        v.add(p1);
        v.add(p2);
        v.add(p3);

        for (Product product : v) {
            
            System.out.println(product);
        }

        System.out.println("\n");

        Iterator itr = v.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println("\n");

        ListIterator l = v.listIterator();

        while(l.hasNext()){

            System.out.println(l.next());
        }

        System.out.println("\n");

        Enumeration e = v.elements();

        while(e.hasMoreElements()){

            System.out.println(e.nextElement());
        }
        
    }
}