import java.util.Scanner;

public class pr2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of array");

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a[][] = new int[n][m];

        for(int i=0 ; i<n; i++){

            for(int j=0; j<m ; j++){

                System.out.println("Enter element");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2 ; i++){

            for(int j = 0 ; j<3; j++){

                System.out.print("Element a[" + i + "][" + j + "] = " + a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
