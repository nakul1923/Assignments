import java.util.Scanner;

public class pr1 {
    
    public static void main(String[] args) {
        
        int arr[] = {10,12,15,18,19,25,35,45,78,80,90,98,105};

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number you want to search");
        int s = sc.nextInt();

        int low=0,high=arr.length-1,mid,flag=0;

        for(int i = 0 ; i<arr.length; i++){

            mid = (high + low) / 2 ;

            if(arr[mid]==s){
                flag = 1;
                break;
            }
            else if(s<arr[mid]){

                high = mid-1;
        

            }
            else {

                low = mid+1;
               
            }
            
        }
        
        if(flag==1){

            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }



        
    }
}
