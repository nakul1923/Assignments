import java.sql.Connection;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        System.out.println("Welcome to nakul's crypto exchange");

        System.out.println("Press 1 to enter into Admin module\nPress 2 to enter into user module");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        //To enter into admin module

        if(choice==1){

            System.out.println("Now were in Admin module");

            System.out.println("Press 1 to do task related to coins:\nPress 2 to do task related to Users");

            int choice1 = sc.nextInt();


            //task related to coins

            if(choice1==1){

                System.out.println("Press 1 to modify coins\nPress 2 to view coins");

                int choice2 = sc.nextInt();
                sc.nextLine();


                if(choice2==1){            //to modify coins

                    System.out.println("Press 1 to add new coin\nPress 2 to delete a coin\nPress 3 to update quantity of a coin");
                    int choice3 = sc.nextInt();
                    sc.nextLine();

                    if(choice3==1){

                        System.out.println("Enter details of coin");
                        System.out.println("Enter Name of Coin: ");
                        String name = sc.nextLine();

                        System.out.println("Enter Symbol of coin: ");
                        String symbol = sc.nextLine();

                        System.out.println("Enter initial quantity of coin: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Price of coin: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Enter date");
                        String date = sc.nextLine();


                        System.out.println("coin added success");
                    } else if(choice3==2){

                        System.out.println("coin deleted success");
                    } else if(choice3==3){

                        System.out.println("update quantity of a coin");
                    } else{

                        System.out.println("Wrong input");
                    }
                } else if(choice2==2){            //to view coins

                    System.out.println("Press 1 to view list of all coins\nPress 2 to view a coin by symbol\nPress 3 to view list by sorting");

                    int choice3 = sc.nextInt();
                    sc.nextLine();

                    if(choice3==1){

                        System.out.println("list of all coins");
                    } else if(choice3==2){

                        System.out.println("search a coin by symbol");
                    } else if(choice3==3){

                        System.out.println("Press 1 for ascending order by name\nPress 2 for ascending order by price\nPress 3 for ascending order by quantity");

                        int choice4 = sc.nextInt();
                        sc.nextLine();

                        if(choice4==1){

                            System.out.println("ascending order by name");
                        } else if(choice4==2){

                            System.out.println("ascending order by price");
                        } else if(choice4==3){

                            System.out.println("ascending order by quantity");
                        } else{

                            System.out.println("wrong input");
                        }
                    } else{

                        System.out.println("wrong input");
                    }
                } else{

                    System.out.println("wrong input");
                }

            } else if(choice1==2){          //task related to users

                System.out.println("Press 1 to See list of all users\nPress 2 to search a user by id");

                int choice2 = sc.nextInt();
                sc.nextLine();

                if(choice2==1){

                    System.out.println("list of all users");
                } else if(choice2==2){

                    System.out.println("Search a user by id");
                } else{

                    System.out.println("wrong input");
                }
            } else{

                System.out.println("wrong input");
            }
        } else if(choice==2){          //To enter into user module

            System.out.println("Now we're in User module");

            System.out.println("Press 1 to login\nPress 2 to signUp");


        } else{

            System.out.println("Wrong input..");
        }
    }
}