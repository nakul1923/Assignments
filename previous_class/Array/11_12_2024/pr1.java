import java.util.Scanner;

public class pr1 {
    
    public static void main(String[] args) {
        
        int arr[] = {1,10,23,45,74,86,54,25,47,84};

        Scanner sc = new Scanner(System.in);
        int i ;

        System.out.println("Enter the number you want to search in array");

        int num = sc.nextInt();

        int flag = 0;

        for( i = 0; i<arr.length; i++){

            if(num==arr[i]){

                flag = 1;
                break;
            }
        }

        if(flag==1){

            System.out.println("Present at postion = " + (i+1));
        }
        else{

            System.out.println("Not present");
        }
    }
}
