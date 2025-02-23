import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;

class Product{

    private int id;
    private String name;
    private double price;
    private double rating;
    
    public Product(int id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter details of Products");

        ArrayList<Product> l = new ArrayList<>();
    
        for(int i=1 ; i<=num ; i++){

            System.out.println("Enter details of " + i + " product");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            if(rating>5.0||rating<0.0){

                throw new NumberFormatException("please enter valid rating");
            }

            l.add(new Product(id, name, price, rating));
        }

        
        Predicate<Product> pr = x->{

            if(x.getPrice()>500&&x.getRating()>4.0){

                return true;
            }
            else{

                return false;
            }
        };


        System.out.println("List of Product that are eligible for discount");
        for(Product y:l){

            if(pr.test(y)==true){

                System.out.println(y.getName());
            }
        }
    }
}