import java.util.*;

class Library{

    String title;
    String author;
    int ISBN;
    double price;

    Library(String title, String author, int ISBN, double price){

        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }

    public String toString(){

        return "Book title : " + title + " Author : " + author + " ISBN : " + ISBN + " Price : " + price;
    }
}

class Main{

    public static void menu(){

        System.out.println("\n\nEnter 1 to See all the available Books \nEnter 2 to add a new book to library \nEnter 3 to Search for a book \nEnter 4 to Remove a book by ISBN \nEnter 5 to check the most Expensive book \nEnter 6 to exit the library\n\n");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Library book1 = new Library("To Kill a Mockingbird", "Harper Lee", 1001, 720);
        Library book2 = new Library("1984", "George Orwell", 1002, 800);
        Library book3 = new Library("Pride and Prejudice", "Jane Austen", 1003, 500);
        Library book4 = new Library("The Great Gatsby", "F.Scott Fitzgerald", 1004, 900);
        Library book5 = new Library("Moby Dick", "Herman Mellvile", 1005, 650);

        ArrayList<Library> list = new ArrayList<>();

        Collections.addAll(list , book1,book2,book3,book4,book5);

        
        System.out.println("Welcome to Nakul's Library\n\n");

        menu();

        while(true){

            int select = sc.nextInt();
            sc.nextLine();
            System.out.println("\n\n");

            if(select==1){

                for(Library book:list){

                    
                    System.out.println(book);
                }

                System.out.println("\n If you want to continue enter 1 or to exit enter any other number\n");
                int con = sc.nextInt();

                if(con==1){

                    menu();
                }else{

                    System.out.println("exited");
                    break;
                }
                
                
            }

            if(select==2){

                System.out.println("\nEnter details of book\n");

                System.out.println("In first line enter title of the book\nIn second line enter author\nIn third line enter ISBN\nIn fourth line enter price\n");

                String title = sc.nextLine();
                String author = sc.nextLine();
                int ISBN = sc.nextInt();
                sc.nextLine();
                double price = sc.nextDouble();

                list.add(new Library(title, author, ISBN, price));

                System.out.println("\nYou have successfully added the book\n");

                System.out.println("\n If you want to continue enter 1 or to exit enter any other number\n");
                int con = sc.nextInt();

                if(con==1){

                    menu();
                } else{

                    System.out.println("exited");
                    break;
                }

            }

            if(select==3){

                int flag = 0;

                System.out.println("\n Enter name of the book to Search\n");

                String search = sc.nextLine();

                for(int i=0;i<list.size();i++){

                    if(list.get(i).title.contains(search)){

                        System.out.println(list.get(i));
                        flag = 1;
                        break;
                    }
                
                }

                if(flag==0){

                    System.out.println("\nThere is no book present with this title\n");
                }

                System.out.println("\n If you want to continue enter 1 or to exit enter any other number\n");
                int con = sc.nextInt();

                if(con==1){

                    menu();
                } else{

                    System.out.println("exited");
                    break;
                }
            
            }

            if(select==4){

                int flag = 0;

                for(Library book:list){

                    System.out.println(book);
                }

                System.out.println("\nHere the list of all the books Enter ISBN of the Book which you want to remove\n");

                int isbn = sc.nextInt();

                for(int i=0;i<list.size();i++){

                    if(list.get(i).ISBN==isbn){

                        flag = 1;
                        System.out.println("\nYou have successfully removed the book : " +list.get(i).title);
                        list.remove(i);
                        
                        break;
                    }
                }

                if(flag==0){

                    System.out.println("You entered wrong ISBN");
                }

                System.out.println("\n If you want to continue enter 1 or to exit enter any other number\n");
                int con = sc.nextInt();

                if(con==1){

                    menu();
                } else{

                    System.out.println("exited");
                    break;
                }
            }

            if(select==5){

                double max = 0;
                int ind = 0;
                for(int i=0;i<list.size();i++){

                    if(list.get(i).price>max){

                        max = list.get(i).price;
                        ind = i;
                    }
                }

                System.out.println("\nThe Most expensive book in library is\n" + list.get(ind) );

                System.out.println("\n If you want to continue enter 1 or to exit enter any other number\n");
                int con = sc.nextInt();

                if(con==1){

                    menu();
                } else{

                    System.out.println("exited");
                    break;
                }
                
            }

            if(select==6){

                System.out.println("Exited");
                break;
            }


        }

    
    }


}