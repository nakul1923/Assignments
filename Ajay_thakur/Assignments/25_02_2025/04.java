import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{

    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    
}

class Main{

    public static void main(String[] args) {
        
        ArrayList<Product> l = new ArrayList<>();

        l.add(new Product(101, "Pencil", 2000));
        l.add(new Product(102, "Earaser", 3000));
        l.add(new Product(103, "Pen", 4000));
        l.add(new Product(104, "Sharpner", 3500));

        List<Double> updatedPrices = l.stream().map(x->x.getPrice()+x.getPrice()*0.15).collect(Collectors.toList());

        System.out.println("Updated prices are " + updatedPrices);
    }
}