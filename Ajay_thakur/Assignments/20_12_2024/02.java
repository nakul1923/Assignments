import java.util.Scanner;

class Demo {


    static int palindrome(int a){

        int n = a ;
        int rem, sum = 0 ;

        while(a>0){
            

            rem = a % 10 ;

            sum = sum * 10 + rem ;

            a = a/10;


        }

        if(sum==n){

            return sum ;
        }
        return 0 ; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("enter array elements");

        for(int i = 0 ; i<arr.length; i++){

            arr[i] = sc.nextInt();        
            
        }

        for(int i = 0 ; i<arr.length; i++){

            System.out.println(palindrome(arr[i]));
        }

        
    }
}