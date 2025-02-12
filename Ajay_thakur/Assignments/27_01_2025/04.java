/*
 * Handling Book Invalid Quantity Exception in Library Software

Mohan, a librarian is creating software to automate his work. As part of this, he needs to handle the exception if the purchased quantity is greater than the available quantity. 
Create a class named "Book" with the following attributes
1.	id - String
2.	bookTitle - String
3.	authorName - String
4.	price - float
5.	quantity - int
Create an Exception class called InvalidQuantityException and use it in the class called “Book”. Include a method called purchase(int quantity) taking the purchased quantity as a parameter and update the quantity available appropriately. Print suitable exception if the purchased quantity is more than the available quantity. Help Mohan to complete this task. Refer to sample input and output.

 */

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