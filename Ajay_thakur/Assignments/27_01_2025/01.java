import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // System.out.println("Start");

        if(num==0){

            throw new ArithmeticException("you entered invalid number: 0");
        }
        if(num>7){

            throw new IllegalArgumentException("you entere invalid number: <7");
        } else{

            System.out.println(num);
        }


        // System.out.println("End");

        
    }
}