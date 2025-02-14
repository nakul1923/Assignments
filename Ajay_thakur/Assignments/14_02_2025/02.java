/*
 * In a bustling classroom, students are specifying their extracurricular activity preferences. To streamline this process, write a program that employs a TreeSet. 

Implement a program that takes the number of students and their unique preferences as input, sorts the preferences, and then simulates allocating the most preferred activity by removing the first preference from the sorted list. Output the updated TreeSet.
Input format :
The first line consists of a single integer N, representing the number of students
The second line consists of N space-separated integers, representing individual preferences.
Output format :
The output prints the updated TreeSet after sorting preferences and simulating allocation by removing the first preference.

 */

import java.util.Scanner;
import java.util.TreeSet;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> t = new TreeSet<>();

        System.out.println("Enter the number of student");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter each student preference");
        String str = sc.nextLine();

        String[] str1 = str.split(" ");


        for(int i=0; i<num; i++){

            t.add(Integer.parseInt(str1[i]));
        }

        t.removeFirst();

        System.out.println(t);
    }
}