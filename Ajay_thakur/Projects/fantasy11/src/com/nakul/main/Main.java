package com.nakul.main;

import com.nakul.*;
import com.nakul.service.FantasyService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void getPrizePoolBreakdown(int id) throws SQLException{

        FantasyService fantasyService = new FantasyService();

        ResultSet rs = fantasyService.getPrizePoolBreakdown(id);

        System.out.println("Prize pool breakdown: ");
        while(rs.next()){

            System.out.println("Rank - " + rs.getInt(1)+ "            Winnings - " + rs.getDouble(2));
        }
    }

    public static void getPlayersByMatch(String match)throws SQLException{

        FantasyService fantasyService = new FantasyService();

        ResultSet rs = fantasyService.getPlayersByMatch(match);

        System.out.println("Select Players from the list                 Total credit limit=100");

        while(rs.next()){

            System.out.println("Id : "+rs.getInt(1)+"Name : "+rs.getString(2)+ "      Team : "+ rs.getString(3)+"      Role : "+ rs.getString(4)+"      Credit : "+rs.getDouble(5));

        }
    }

    public static void availableContests() throws SQLException{

        FantasyService fantasyService = new FantasyService();

        ResultSet rs = fantasyService.availableContests();

        System.out.println("Available contests: ");
        while(rs.next()){

            System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Entry fee: "+rs.getDouble(3)+" PrizePool: "+rs.getDouble(4)+" Max participant: "+rs.getInt(5));
        }

    }

    public static void getListOfPlayers() throws SQLException{

        FantasyService fantasyService = new FantasyService();
        Scanner sc = new Scanner(System.in);

        ResultSet rs =  fantasyService.getListOfPlayers();

        while(rs.next()){

            System.out.println("Id: "+ rs.getInt(1)+" Name: "+rs.getString(2)+" Team: "+rs.getString(3)+" Role: "+rs.getString(4));
        }

    }

    public static void main(String[] args) throws SQLException {

        FantasyService fantasyService = new FantasyService();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Welcome to fantasy11");
            System.out.println("Press 1 to admin login\nPress 2 to Sign Up\nPress 3 to Sign In");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("admin login");

                System.out.println("Username: ");
                String username = sc.nextLine();

                System.out.println("Password: ");
                String password = sc.nextLine();

                Admin admin = fantasyService.checkAdmin(username,password);

                try{

                    if(username.equals(admin.getUsername())&&password.equals(admin.getPassword())){

                        System.out.println("verified");
                        while(true){

                            System.out.println("1 to Add new player\n2 to add new contest\n3 to delete a player\n4 to delete a contest\n5 to go previous menu");
                            int choice1 = sc.nextInt();
                            sc.nextLine();

                            if(choice1==1){

                                System.out.println("Enter Player Name: ");
                                String playerName = sc.nextLine();

                                System.out.println("Enter Team: ");
                                String team = sc.nextLine();

                                System.out.println("Enter Role: ");
                                String role = sc.nextLine();

                                System.out.println("Enter Credits: ");
                                double credits = sc.nextDouble();

                                Players player = new Players(playerName,team,role,credits);
                                fantasyService.addPlayer(player);

                                System.out.println("player added successfully");
                            } else if (choice1==2) {

                                System.out.println("add new contest");

                                System.out.println("Enter 3 digit contest id: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Enter contest name: ");
                                String name = sc.nextLine();

                                System.out.println("Enter entry fee: ");
                                double entryFee = sc.nextDouble();

                                System.out.println("Enter max participants: ");
                                int maxPart = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Enter prize pool: ");
                                double prizePool = sc.nextDouble();

                                Contests contest = new Contests(id,name,entryFee,prizePool,maxPart);

                                fantasyService.addContest(contest);

                                System.out.println("Now enter prize pool winnings : ");

                                double remainingAmount=prizePool;

                                for(int i=1;i<=maxPart;i++){

                                    System.out.println("Enter winnings for rank "+ i+" : ");
                                    double winnings = sc.nextDouble();
                                    if(winnings>remainingAmount){

                                        System.out.println("please enter amount less than prize pool");
                                        break;
                                    }else{

                                        remainingAmount = remainingAmount-winnings;

                                        PrizePoolBreakdown ppb = new PrizePoolBreakdown(i,winnings,id);

                                        fantasyService.addPrizePoolBreakdown(ppb);
                                    }
                                }

                                System.out.println("contest added successfully");

                            } else if (choice1==3) {

                               getListOfPlayers();

                                System.out.println("\nEnter player id to delete a player");
                                int id = sc.nextInt();
                                sc.nextLine();

                                fantasyService.deletePlayer(id);
                                System.out.println("Player deleted successfully");

                            } else if (choice1==4) {

                                availableContests();

                                System.out.println("\nEnter contest id to delete a contest: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                fantasyService.deleteContest(id);
                                System.out.println("Contest deleted successfully");

                            } else if (choice1==5) {
                                break;
                            } else{

                                System.out.println("Wrong input! please insert valid input...");
                            }

                        }

                    }
                } catch (NullPointerException n){

                    System.out.println("wrong credentials");
                }


            } else if (choice == 2) {


                System.out.println("Enter name: ");
                String username = sc.nextLine();

                System.out.println("Enter phone: ");
                String phone = sc.nextLine();

                System.out.println("Enter password");
                String password = sc.nextLine();

                Users user = new Users(username, phone, password);
                fantasyService.addUser(user);

            } else if(choice==3){

                System.out.println("Phone: ");
                String phone = sc.nextLine();
                System.out.println("Password: ");
                String password = sc.nextLine();

                Users user =  fantasyService.checkLogin(phone,password);

                try{

                    if(phone.equals(user.getPhone())&&password.equals(user.getPassword())){

                        System.out.println("verified");

                        System.out.println("User details: \nName: "+user.getUsername()+"\nPhone: "+user.getPhone()+"\nWallet Balance: "+user.getWallet());

                        System.out.println("1 to join contest\n2 to add money in wallet\n3 to logout");
                        int choice1 = sc.nextInt();
                        sc.nextLine();

                        if(choice1==1){

                            availableContests();

                            System.out.println("Enter Id to select a contest: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            ResultSet rs = fantasyService.getContestById(id);

                            if(rs.next()){

                                System.out.println("You selected: \nName: "+rs.getString(2)+"    Entry Fee: "+rs.getDouble(3)+"    Prize Pool: " +  rs.getDouble(4));
                            }


                            getPrizePoolBreakdown(id);

                            System.out.println("1 to join contest\n2 to go back");

                            int choice2=sc.nextInt();

                            if(choice2==1){

                                System.out.println(user.getWallet());
                                System.out.println(rs.getDouble("entry_fee"));
                                if(user.getWallet()>=rs.getDouble("entry_fee")){

                                    String match = rs.getString("name");

                                    System.out.println("Rules for selecting a team:\n1. create your team under the total credit of 90.00\n2. you have to select atleast 1 player of each role\n3. you cannot select more than 7 players of one team\n4. you cannot select more than 5 players in any role.");

                                    getPlayersByMatch(match);

                                    double credit = 90;

                                    ArrayList<Players> list = new ArrayList<>();

                                    for(int i=0;i<11;i++){

                                        if(credit>0){

                                            System.out.println("Enter Id to add players in your team: ");

                                            int id1=sc.nextInt();
                                            sc.nextLine();

                                            Players player =  fantasyService.getPlayerById(id1);

                                            list.add(player);

                                            for(int j=0;j<list.size();j++){

                                                System.out.println(list.get(j));
                                            }

                                            credit = credit-player.getCredits();
                                            System.out.println("\nPlayer selected: "+(i+1));
                                            System.out.println("credit left: "+credit);

                                        } else{

                                            try{

                                                throw new IllegalArgumentException("Please create team in available credit");

                                            } catch (IllegalArgumentException e){

                                                System.out.println("Please create team in available credit limit");
                                            }

                                        }

                                    }

                                    if(list.size()==11){

                                        // continue from here
                                    }

                                }else{

                                    System.out.println("not enough money in your wallet! please add money to join contest");
                                }
                            }
                        } else if (choice1==2){

                            System.out.println("Enter amount to add money in your wallet: ");
                            double amount = sc.nextDouble();

                            fantasyService.addMoney(amount,user.getPhone());
                        }
                    }
                }catch(NullPointerException n){

                    System.out.println("Wrong credentials");
                }


            }

        }

    }
}
