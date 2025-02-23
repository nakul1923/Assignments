import java.util.*;

class QuantitySorting implements Comparator<Product>{

    public int compare(Product p1, Product p2){

        return p2.getProductQuantity()-p1.getProductQuantity();
    }
}

class NameSorting implements Comparator<Product>{

    public int compare(Product p1, Product p2){

        return p1.getProductName().compareTo(p2.getProductName());
    }
}

class Product implements Comparable<Product>{

    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    
    public Product(int productId, String productName, double productPrice, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
                + ", productQuantity=" + productQuantity + "]";
    }

    public int compareTo(Product p){

        return (int)this.getProductPrice()-(int)p.getProductPrice();
    }

}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Set<Product> s = new TreeSet<Product>(new QuantitySorting());

        System.out.println("Enter the Number of products : ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){

            System.out.println("Enter Details of " + (i+1) + " Product");

            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name : ");
            String name = sc.nextLine();

            System.out.println("Enter Price : ");
            double price = sc.nextDouble();

            System.out.println("Enter Quantity : ");
            int quantity = sc.nextInt();

            s.add(new Product(id, name, price, quantity));
        }

        System.out.println(s);
    }
}