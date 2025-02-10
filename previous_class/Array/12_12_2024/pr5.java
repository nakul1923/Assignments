public class pr5 {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int sum = 0,avg ;

        for(int i = 0 ; i<arr.length; i++  ){

            sum = sum + arr[i];

        }

        System.out.println("Average of element of an array is = " + (sum/arr.length));
    }
}