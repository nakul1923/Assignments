import java.util.Scanner;


public class pr2 {
    
    public static void main(String[] args) {
        
        int arr[] = {1,10,23,45,74,86,54,25,47,84,47};

        Scanner sc = new Scanner(System.in);
        int i ;

        System.out.println("Enter the number you want to search in array");

        int num = sc.nextInt();

        int flag = 0;

        int count =0;

        

        

        for( i = 0; i<arr.length; i++){

            if(num==arr[i]){

                if(count == 0){

                    System.out.println("given element is present at position : ");
                }
                count++;

                
                System.out.print((i+1) + ", ");
                flag = 1 ;
                
                
            }
        }

        if(flag == 0){

            System.out.println("Not present");
        }

        
    }
}
