import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int bigger ;

        if(n1>n2&&n1>n3){

            if(n2*n2+n3*n3==n1*n1){

                System.out.println("Right angel triangle");
            }else {

                System.out.println("Not");
            }
        }else if(n2>n3){

            if(n1*n1+n3*n3==n2*n2){

                System.out.println("Right angel triangle");
            }else {

                System.out.println("Not");
            }
            
        } else{
            if(n2*n2+n1*n1==n3*n3){

                System.out.println("Right angel triangle");
            }else {

                System.out.println("Not");
            }
            bigger = n3;
        }

        
    }
}