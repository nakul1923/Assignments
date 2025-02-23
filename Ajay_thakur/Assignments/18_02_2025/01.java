import java.util.Scanner;
import java.util.TreeMap;


class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TreeMap<Integer,String> t = new TreeMap<>();

        System.out.println("Enter total number of Students");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Details");
        for(int i=0; i<num; i++){

            System.out.println("Enter marks");
            int marks = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            String name = sc.nextLine();

            t.put(marks, name);
        }

        System.out.println(t);


    }
}