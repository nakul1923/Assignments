/*
 * WAP to print star vertically by taking user input
 */
import java.util.Scanner;
public class pattern2 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            System.out.println("*");
        }
        System.out.println();
    }

}
