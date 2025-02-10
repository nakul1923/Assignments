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

        for(Product student:list){

            System.out.println(student);
        }

        ListIterator<Product> it = list.listIterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        for(Product student:list){

            if(student.pprice>500){

                System.out.println(student);
            }
            
        }

        
    }
}