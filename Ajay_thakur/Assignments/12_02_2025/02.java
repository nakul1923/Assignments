/*
 * Top 5 Product Prices
Scenario:
An e-commerce platform wants to store unique product prices and display them in descending order to highlight the most expensive products first.

Task:
Use a TreeSet<Double> to store product prices.
Sort in descending order.
Note:Read data from user.

 */


import java.util.*;


class MySorting implements Comparator<Double>{


    
    public int compare(Double o1, Double o2) {
        
        return -o1.compareTo(o2);
    }
}


class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TreeSet<Double> t = new TreeSet<>(new MySorting());

        System.out.println("Enter the number of product prices you want to add");
        int num = sc.nextInt();

        System.out.println("Enter prices of products");

        for(int i=0 ; i<num; i++){

            t.add(sc.nextDouble());
        }

        System.out.println(t);
    }
}