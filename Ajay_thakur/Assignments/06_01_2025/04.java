abstract class LibraryItem{

    String title;
    String author;

    LibraryItem(String title, String author){

        this.author = author;
        this.title  = title;

    }

    abstract void checkout();

    abstract void returnItem();

    void displayInfo(){

        System.out.println("Title : " + title);

        System.out.println("Author : " + author);
    }
}

class Book extends LibraryItem{

    int pages;

    Book(String title, String author, int pages){

        super(title,author);
        this.pages = pages;
    }

    void checkout(){

        System.out.println("Checking out Book: " + title);
    }

    void returnItem(){

        System.out.println("Returning Book: " + title);
    }

}

class DVD extends LibraryItem{

    int duration;

    DVD(String title, String author, int duration){

        super(title,author);
        this.duration = duration;
    }

    void checkout(){

        System.out.println("Checkout DVD: " + title);
    }

    void returnItem(){

        System.out.println("Returning DVD: " + title);
    }
}

class Main{
    public static void main(String[] args) {
        
        Book book1 = new Book("Ramayan", "Kalida", 400);

        book1.displayInfo();
        book1.checkout();
        book1.returnItem();

        DVD dvd1 = new DVD("Spiderman", "nakul panchal", 120);

        dvd1.displayInfo();
        dvd1.checkout();
        dvd1.returnItem();

    }
}