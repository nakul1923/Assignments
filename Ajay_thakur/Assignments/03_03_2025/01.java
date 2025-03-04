import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Student : ");

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names of students");

    
        PrintWriter pw = new PrintWriter("Student.txt");

        for(int i=0; i<n; i++){

            String name = sc.nextLine();

            pw.println(name);
        }

        pw.close();

        System.out.println("Names are added successfully");

    }
}