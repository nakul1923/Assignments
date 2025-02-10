public class pr6 {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};
        

        for(int i = 0 ; i<arr.length; i++  ){

            if(arr[i]>25){

                arr[i] = 25;
            }


        }

        System.out.println("Updated elements are : ");

        for(int i = 0 ; i<arr.length ; i++){

            System.out.print(arr[i] + "  ");
        }

        
    }
}