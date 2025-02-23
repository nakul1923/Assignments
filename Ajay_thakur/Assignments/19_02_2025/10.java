import java.util.Scanner;

interface I1{

    public String evenOdd(int n);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = n->{

            if(n%2==0){

                return "even";
            } else{

                return "odd";
            }
        };

        System.out.println(obj.evenOdd(102));
        System.out.println(obj.evenOdd(103));
    }
}