import java.util.*;
// import java.lang.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers separated with space");

        String s = sc.nextLine();

        int[] arr = new int[2];

        int a,b;

        String[] sArr = s.split(" ");

        a = Integer.parseInt(sArr[0]);
        b = Integer.parseInt(sArr[1]);
         try{

            System.out.println("Divison is " + a/b);
         } catch(ArithmeticException aa){

            System.out.println(aa);
            // aa.printStackTrace();
         }
        
    }
}