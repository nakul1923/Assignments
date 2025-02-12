/*
 * Unique City Names Storage
Scenario:
A travel agency maintains a list of unique city names from customer bookings, sorted alphabetically.
Task:
Use a TreeSet<String> to store city names.
Add city names dynamically.
Display them in reverse lexicographical order.
Prevent duplicate entries.

 */


import java.util.*;


class MySorting implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        
        return -o1.compareTo(o2);
    }
}


class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TreeSet<String> t = new TreeSet<>(new MySorting());

        System.out.println("Enter the number of Citites you want to add");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter City names");

        for(int i=0 ; i<num; i++){

            
            t.add(sc.nextLine());
        }

        System.out.println(t);
    }
}