package com.nakul.main;

import com.nakul.model.Contest;
import com.nakul.model.Players;
import com.nakul.model.PrizePoolBreakdown;
import com.nakul.model.Users;
import com.nakul.service.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc(){

        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static void getListOfPlayers() throws SQLException{

        PlayersService playersService = new PlayersService();

        ResultSet rs = playersService.getListOfPlayers();

        while(rs.next()){

            System.out.println("Id: "+ rs.getInt(1)+" Name: "+rs.getString(2)+" Team: "+rs.getString(3)+" Role: "+rs.getString(4));
        }
    }


    public static void getListOfContests()throws SQLException{

        ContestService contestService = new ContestService();

        ResultSet rs = contestService.getListOfContests();

        while(rs.next()){

            System.out.println("Contest Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Entry fee: " + rs.getDouble(3) + " Prize Pool: " + rs.getDouble(4) + " Max Participant: " + rs.getInt(5));
        }
    }

    public static void listOfPlayersByContest(String match)throws SQLException{

        PlayersService playersService = new PlayersService();

        playersService.getListOfPlayersByMatch(match);
    }

    public static ResultSet getContestById(int id)throws SQLException {

        ContestService contestService = new ContestService();


        ResultSet rs = contestService.getContestById(id);

        return rs;


    }

    public static int loginPage(){

        Scanner sc = sc();
        System.out.println("Welcome to Fantasy11");
        System.out.println("Press 1 to admin login\nPress 2 to Sign Up\nPress 3 to Sign In");

        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

    public static void adminLogin() throws SQLException {

        AdminService adminService = new AdminService();

        Scanner sc = sc();
        System.out.println("admin login");

        System.out.println("Username: ");
        String username = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        boolean adminCheck =  adminService.checkAdmin(username,password);

        if(adminCheck==false){

            System.out.println("Wrong credentials!  \nPress 1 to Retry\nPress 2 to Go back");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice==1){

                adminLogin();

            } else if(choice==2){

                loginPage();
            } else{

                System.out.println("wrong input! please enter valid value");
                adminLogin();
            }
        } else{

            adminTask();
        }


    }


    public static void adminTask() throws SQLException{

        Scanner sc = sc();
        System.out.println("Admin logged in successfully");
        System.out.println("1 to Add new player\n2 to add new contest\n3 to delete a player\n4 to delete a contest\n5 to Log Out");

        int choice = sc.nextInt();
        sc.nextLine();

        if(choice==1){

            addPlayer();
        } else if(choice==2){

            addContest();

        } else if(choice==3){

            deletePlayer();

        } else if(choice==4){

            deleteContest();

        } else if(choice==5){

            loginPage();

        } else{

            System.out.println("Wrong input! Please enter valid input");
        }
    }

    public static void addPlayer()throws SQLException{

        PlayersService playersService = new PlayersService();

        int flag1 = 0;

        Scanner sc = sc();
        System.out.println("Enter Player Name: ");
        String playerName = sc.nextLine();

        System.out.println("Enter Team: ");
        String team = sc.nextLine();

        System.out.println("Enter Role: ");
        String role = sc.nextLine();

        System.out.println("Enter Credits: ");
        double credits = sc.nextDouble();

        Players player = new Players(playerName,team,role,credits);

        boolean flag =  playersService.addPlayer(player);

        if(flag==true){

            System.out.println("Player added successfully");
            adminTask();

        } else{

            System.out.println("Something went wrong please try again!");
        }

    }

    public static void addContest()throws SQLException{

        ContestService contestService = new ContestService();

        Scanner sc = sc();
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

        System.out.println("Now enter Prize pool winnings: ");

        Contest contest = new Contest(id,name,entryFee,prizePool,maxPart);
        boolean flag =  contestService.addContest(contest);

        if(flag==true){

            System.out.println("Contest added successfully");
            prizePoolBreakdown(prizePool,maxPart,id);
        } else{

            System.out.println("Something went wrong! please try again");
            addContest();
        }


    }

    public static void prizePoolBreakdown(double prizePool,int maxPart,int id)throws SQLException{

        PrizePoolBreakdownService prizePoolBreakdownService = new PrizePoolBreakdownService();
        Scanner sc = sc();
        double remainingAmount = prizePool;

        for(int i=1; i<=maxPart;i++){

            System.out.println("Remaining amount: " + remainingAmount);
            System.out.println("Enter prize for rank " + i + " : ");
            double prize = sc.nextDouble();

            if(prize>remainingAmount){

                System.out.println("Please enter amount less than remaining amount!");

                prizePoolBreakdownService.deletePrizePoolBreakdown(id);

                prizePoolBreakdown(prizePool,maxPart,id);

                break;

            } else{

                remainingAmount = remainingAmount - prize;

                PrizePoolBreakdown ppb = new PrizePoolBreakdown(i,prize,id);

                prizePoolBreakdownService.addPrizePool(ppb);


            }


        }

        System.out.println("Contest added successfully");
        adminTask();

    }



    public static void deletePlayer()throws SQLException{

        PlayersService playersService = new PlayersService();
        Scanner sc = sc();
        getListOfPlayers();

        System.out.println("Enter Id of player you want to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean flag =  playersService.deletePlayer(id);

        if(flag==true){

            System.out.println("Player deleted successfully");
            adminTask();
        } else{

            System.out.println("please enter valid player Id:");
            deletePlayer();
        }

    }

    public static void deleteContest()throws SQLException{

        ContestService contestService = new ContestService();
        Scanner sc = sc();
        getListOfContests();

        System.out.println("Enter Id to delete a contest ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean flag =  contestService.deleteContest(id);

        if(flag==true){

            System.out.println("Contest deleted successfully");
            adminTask();

        } else{

            System.out.println("Please enter valid player Id: ");
            deleteContest();
        }

    }



    // Admin work done here

    public static void signUp()throws SQLException{

        Scanner sc = sc();
        UsersService usersService = new UsersService();

        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Phone");
        String phone = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        Users user = new Users(username,password,phone);

        boolean flag =  usersService.addUser(user);

        if(flag==true){

            System.out.println("Signed up success!");
        }else{

            System.out.println("Please Enter valid values");
            signUp();
        }

    }

    public static void signIn()throws SQLException{

        Scanner sc = sc();
        UsersService usersService = new UsersService();

        System.out.println("Enter phone: ");
        String phone = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        ResultSet rs = usersService.checkUser(phone,password);

        if(rs.next()){

            System.out.println("Signed In successfully");

            System.out.println("Name: " + rs.getString("username") + "\nPhone: " + rs.getString("phone") + "\nWallet Balance: " + rs.getDouble("wallet"));

            Users user = new Users(rs.getString(2),rs.getString(4),rs.getString(3),rs.getDouble(5));

            userTask(user);
        } else{

            System.out.println("Wrong credentials!");
        }
    }

    public static void addMoney(Users user)throws SQLException{

        Scanner sc = sc();

        UsersService usersService = new UsersService();

        System.out.println("Enter amount you want to add in wallet: ");
        double amount = sc.nextDouble();

        boolean flag =  usersService.addMoney(amount, user.getPassword());

        if(flag==true){

            System.out.println("Money deposited successfully!");
            userTask(user);

        } else{

            System.out.println("Something went wrong!");
            userTask(user);
        }
    }

    public static void userTask(Users user)throws SQLException{

        Scanner sc = sc();

        System.out.println("Name: " + user.getUsername() + "\nPhone: " + user.getPhone() + "\nWallet Balance: " + user.getWallet());

        System.out.println("1 to join Contest\n2 to add money in wallet\n3 to log out");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice==1){

            joinContest();

        } else if(choice==2){

            addMoney(user);

        } else if(choice==3){

            loginPage();

        } else{

            System.out.println("Wrong input! please enter valid input...");
            userTask(user);
        }
    }

    public static void joinContest()throws SQLException{

        Scanner sc = sc();
        getListOfContests();

        System.out.println("Enter Id of contest you want to join: ");
        int id = sc.nextInt();
        sc.nextLine();

        ResultSet rs =  getContestById(id);

        if (rs.next()) {

            System.out.println("You selected: \nName: " + rs.getString(2) + "    Entry Fee: " + rs.getDouble(3) + "    Prize Pool: " + rs.getDouble(4));

            createTeam(rs.getString(2));

        } else{

            System.out.println("Please Enter valid Contest Id: \n");
            joinContest();
        }



    }

    public static void createTeam(String match)throws SQLException{

        Scanner sc = sc();
        PlayersService playersService = new PlayersService();

        double credit = 100;
        ArrayList<Players> list = new ArrayList<>();
        listOfPlayersByContest(match);
        System.out.println("Rules for selecting a team:\n1. create your team under the total credit of 100.00\n2. you have to select atleast 1 player of each role\n");

        for(int i=1; i<=11; i++){

            if(credit>0){

                System.out.println("Enter Id to add players in your team: ");
                int id = sc.nextInt();
                sc.nextLine();

                Players player = playersService.getPlayerById(id);

                list.add(player);

                for(int j=0;j<list.size();j++){

                    System.out.println(list.get(j));
                }

                credit = credit-player.getCredits();
                System.out.println("\nPlayer selected: "+(i));
                System.out.println("credit left: "+credit);

            } else{

                System.out.println("Please create team under available credit!..");
                createTeam(match);
            }


        }

    }


    public static void main(String[] args) throws SQLException {

        while(true){

            int choice = loginPage();
            if(choice==1){

                adminLogin();

            } else if(choice==2){

                signUp();

            } else if(choice==3){

                signIn();
            }
        }

    }
}
