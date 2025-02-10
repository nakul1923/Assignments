/*
 Venue Details

Create a class named Main and create two variables named, venueName and city of type string.
Write a main method to get the venue details in the string separated by a comma. Use String.split() function to display the details.
Input format :
The first line consists of a String that represents the venueName and city.
Output format :
The output should display the venue details.
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
M. A. Chidambaram Stadium,Chennai
Output 1 :
Venue Details:
Venue Name: M. A. Chidambaram Stadium
City Name: Chennai
Input 2 :
The Oval,London
Output 2 :
Venue Details:
Venue Name: The Oval
City Name: London
 */

import java.util.*;

class Main{

    static String venueName;
    static String city;

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Venue name and city seprated with comma");

    String s = sc.nextLine();

    String[] str = s.split(",");

    venueName = str[0];
    city  = str[1];

    System.out.println("venue name : " + venueName);
    System.out.println("City : " + city);

}
}