import java.util.*;


class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and upper limit");
        int a = sc.nextInt();

        int b = sc.nextInt();
            
        System.out.println(Math.floor((Math.random())*(b-a)+a)+1);
    }
}