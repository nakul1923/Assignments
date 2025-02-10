import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int num = n ;
        int rem,sum=0;

        while(n>0){

            rem = n%10;
            sum = sum * 10 +rem;
            n=n/10;
        }

        if(sum==num){

            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }
    }
}