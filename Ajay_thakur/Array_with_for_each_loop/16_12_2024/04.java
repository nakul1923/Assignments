/*
 * 
 * taking array size from user and printing elements of array
 */

 import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size");

        int y =  sc.nextInt();
        
        int x[] = new int [y];

        System.out.println("Enter elements of array");

        for(int i = 0 ; i<y ; i++){

            x[i] = sc.nextInt();
        }

        System.out.println("Elements are");

        for(int w:x){

            System.out.println(w);
        }
    
    }
}