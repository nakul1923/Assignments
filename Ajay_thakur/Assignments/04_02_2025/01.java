/*
 * Write a Java program that takes integer data from the user and adds it to an ArrayList. Perform the following operations:

1.	Check if a given number exists in the ArrayList or not.
2.	Remove a particular element from the ArrayList and display the updated ArrayList.
     3. Print all the elements of the ArrayList using a for loop.
   4. Print all the elements using the Iterator interface.
   5. Print all the elements using the for-each loop.
   6. Print all the elements in descending order.
  7. Count how many elements are there in the ArrayList. 
Input format :
The first line of the input should contain an integer representing the size of the ArrayList
The second line of the input should contain the elements to be added to the ArrayList
The third line of the input should contain the number to be searched in the ArrayList.
The fourth line of the input should contain the number to be removed from the ArrayList
Output format :
The output should display the elements in the list after the removal.
Refer to the sample output for reference.

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("Enter 5 numbers");

        for(int i = 0; i<5;i++){

            list.add(sc.nextInt());
            
        }

        System.out.println("Checking a number present in array list or not");
        System.out.println(list.contains(5));

        System.out.println("removing a particular element from ArrayList");
        list.remove(Integer.valueOf(20));

        System.out.println(list);

        System.out.println("Printing all the elements of an ArrayList with using for loop");
        for(int i=0; i<list.size(); i++){

            System.out.println(list.get(i));
        }

        System.out.println("Printing all the elements of an ArrayList using Iterator interface");

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println("Printing all the elements of an ArrayList using for each loop");

        for(Integer i:list){

            System.out.println(i);
        }

        System.out.println("Getting maximum value from ArrayList");
        int max = 0 ;
        for(int i = 0;i<list.size()-1;i++ ){

            max = list.get(i);
            for(int j = i+1;j<list.size();j++){

                if(max<list.get(j)){

                    max = list.get(j);
                }
            }

           
        }

        System.out.println(max);

        System.out.println("Printing how many elements are present in ArrayList");
        System.out.println(list.size());    

    }
}