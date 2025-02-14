/*
 * Problem Statement

In a ticket reservation system, you store the available seat numbers in a TreeSet. Users input their desired seat number, and the program checks whether the chosen seat is available. 

Using a TreeSet ensures quick and efficient verification of seat availability, ensuring a smooth and organized ticket booking process.
Input format :
The first line of input contains a single integer n, representing the number of available seats.
The second line contains n space-separated integers, representing the available seat numbers.
The third line contains an integer m, representing the seat number that needs to be searched.
Output format :
The output displays "[m] is present!" if the given seat is available. Otherwise, it displays "[m] is not present!"

 */

import java.util.Scanner;
import java.util.TreeSet;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of available seats");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter all the available Seats");

        String str = sc.nextLine();

        String[] str1 = str.split(" ");

        TreeSet<Integer> t = new TreeSet<>();

        for(int i = 0; i<num; i++){

            t.add(Integer.parseInt(str1[i]));
        }

        System.out.println(t);

        System.out.println("Enter the Seat number to search");
        int s = sc.nextInt();
        
        if(t.contains(s)){
            
            System.out.println(s + " is present");
        } else{

            System.out.println(s + " is not present");
        }

        
    }
}