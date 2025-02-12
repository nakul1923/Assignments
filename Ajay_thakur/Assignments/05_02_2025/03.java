/*
 * 
Library Book Issuing System
Scenario: A library maintains a list of books currently issued to students. Each Book has bookId, title, author, and issuedToStudent.
Tasks:
Maintain a LinkedList<Book> for issued books.
Add a new issued book to the list.
Remove a book when it is returned.
Find if a particular bookId is currently issued.
Display all issued books.

 */

import java.util.*;

class Book{

    String title;
    int id;
    String author;
    String issuedToStudent;

    

    public Book(String title, int id, String author, String issuedToStudent) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.issuedToStudent = issuedToStudent;
    }



    @Override
    public String toString() {
        return "Book [title=" + title + ", id=" + id + ", author=" + author + ", issuedToStudent=" + issuedToStudent
                + "]";
    }

    
}

class Library{


    LinkedList<Book> ll = new LinkedList<>();

    public void addBook(Book book){

        ll.add(book);

        System.out.println("Book added");
    }

    public void remove(int bookId){

        Iterator<Book> itr = ll.iterator();

        while(itr.hasNext()){

            Book book = itr.next();

            if(book.id == bookId){

                itr.remove();

                System.out.println("Book removed " + book.title);
                return;
            }
        }
    }

    public boolean isBookIssued(int bookId){

        for(Book book:ll){
            
            if(book.id == bookId){

                return true;
            }
            
        }

        return false;
        
    }

    public void displayBooks(){

        System.out.println(ll);
    }
}

class Main{

    public static void main(String[] args) {
        
        Library library = new Library();
        library.addBook(new Book("Maths", 101, "RD sharma", "nakul"));
        library.addBook(new Book("physics", 102, "rajesh", "rohit"));
        library.addBook(new Book("chemistry", 103, "mukesh", "arpit"));

        library.displayBooks();

        library.remove(102);

        library.displayBooks();

        System.out.println(library.isBookIssued(102));
        
    }
}