import java.util.Scanner;
import java.lang.String;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name here you can use uppercase and Lowercase \nJaisi aapki marzi ho wesa naam daldo agar girlfriend nahi hai to biwi ka naam daldo");

        String s = sc.nextLine();

        // String s1 = "hello pagal";

        System.out.println(s.subSequence(5, 10));
    }
}
