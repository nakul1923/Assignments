public class pr4 {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int sum = 0 ;

        for(int i = 0 ; i<arr.length; i++  ){

            if(i%2!=0){

                sum = sum + arr[i];
            }

        }

        System.out.println("sum of alternate element of an array is = " + sum);
    }
}
