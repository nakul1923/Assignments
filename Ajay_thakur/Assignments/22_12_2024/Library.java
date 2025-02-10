class Book{

    String title;
    String author;
    double price;
    int quantity;

    Book(String title, String author, double price, int quantity){

        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails(){

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }

}

class Main1{

    public static void main(String[] args) {
        
        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 350.00, 19);
        Book book2 = new Book("1 States: The Story of My Marriage", "Chetan Bhagat",250, 25);
        Book book3 = new Book("The White Tiger", "Aravind Adiga", 600.00, 5);
        Book book4 = new Book("Train to Pakistan", "Khushwant Singh", 300.00, 45);

        System.out.println("Book 1 Details :");
        book1.displayDetails();
        System.out.println("\nBook 2 Details :");
        book2.displayDetails();
        System.out.println("\nBook 3 Details :");
        book3.displayDetails();
        System.out.println("\nBook 4 Details :");
        book4.displayDetails();System.out.println("Book 1 Details :");


    }
}