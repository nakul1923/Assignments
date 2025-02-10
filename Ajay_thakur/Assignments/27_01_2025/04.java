import java.util.*;

class Book{

    int id;
    String bookTitle;
    String authorName;
    double price;
    int quantity;

    Book(int id, String bookTitle, String authorName, double price, int quantity){

        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    void purchase(int quantity){

        if(this.quantity>=quantity){

            System.out.println("Thank you for visit you have purchased total " + quantity + " books") ;
            this.quantity = this.quantity - quantity;
            System.out.println("Remaining quantity: " + this.quantity);
        } else{

            throw new InvalidQuantityException("No quantity left");
        }
    }
}

class InvalidQuantityException extends RuntimeException{

    InvalidQuantityException(String str){

        super(str);
    }
}

class Main{

    public static void main(String[] args) {
        
        Book b1 = new Book(101, "Bhagwat Geeta", "Tulsi Das", 300, 10);

        b1.purchase(6);
        b1.purchase(5);
    }
}