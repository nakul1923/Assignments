

/*
 * WAP to print table of any number till users choice
 */

 import java.util.Scanner;
public class pr3 {

    public static void main(String[] args) {

        int n,choice;
    
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter the no you want to print table : ");
        n = sc.nextInt();

        
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
       

        System.out.println("if you want to print another number table.... Press '1' ");
        choice = sc.nextInt();


    }while(choice==1);

    System.out.println("That's it......");
}
        
}

    
