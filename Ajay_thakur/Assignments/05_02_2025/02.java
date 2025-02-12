/*
 * You are tasked with developing a simple inventory management system for a library that keeps track of book titles using a LinkedList. The program should allow the user to input a specified number of book titles and then display the list of books in the inventory.
Input format :
The first line of the input contains the number of books.
The subsequent lines each contain the title of a book.
Output format :
Displays the final list of books
Refer to the sample output
Sample test cases :
Input 1 :
2
The Great Gatsby
Moby Dick
Output 1 :
Books in the inventory:
The Great Gatsby
Moby Dick

 */


import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books you want to enter");
        int n = sc.nextInt();
        sc.nextLine();

        LinkedList<String> ll = new LinkedList<>();

        for(int i =0 ; i<n;i++){
           
            String book = sc.nextLine();
            ll.addLast(book);

        }

        System.out.println(ll);
        
    }
}