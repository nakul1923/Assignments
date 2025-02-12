/*
 * 1. Bank Account Management
Objective: Create a program to manage bank accounts and handle exceptions for insufficient balance and negative deposit amounts.

Details:
Create a BankAccount class with fields for accountNumber, accountHolder, and balance.
Define two custom exceptions:
InsufficientBalanceException for withdrawal amounts exceeding the balance.
NegativeDepositException for deposits with negative amounts.
Include methods for deposit(double amount) and withdraw(double amount) that throw the respective exceptions.
In the main method, demonstrate various cases like successful transactions, insufficient balance, and invalid deposits.
 */

import java.util.*;

class BankAccount{

    int accountNumber;
    String accountHolder;
    double amount;

    BankAccount(int accountNumber,String accountHolder,double amount){

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.amount = amount;
    }
    void deposit(int deposit){

        if(deposit<0){

            throw new NegativeDepositException("Negative deposit amount");
        }
        amount = amount + deposit;

        System.out.println("Your deposit has successfully done:  Your account balance is " + amount);
    }

    void withdraw(int withdraw){

        if(withdraw>amount){

            throw new InsufficientBalanceException("Insufficent balance");
        }
        amount = amount - withdraw;

        System.out.println("Your withdraw has successfully done:  Your account balance is " + amount);
    }
}

class InsufficientBalanceException extends RuntimeException{

    InsufficientBalanceException(String str){

        super(str);
    }
}

class NegativeDepositException extends RuntimeException{

    NegativeDepositException(String str){

        super(str);
    }

}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number, enter your name,enter amount");
        BankAccount acc1 = new BankAccount(Integer.parseInt(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine()));

        acc1.deposit(10000);
        acc1.withdraw(5000);

        acc1.deposit(-1000);
        acc1.withdraw(20000);

    }
}