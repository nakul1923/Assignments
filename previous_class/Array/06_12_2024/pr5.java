public class pr5 {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50,60,70};

        for(int i = 0 ; i<arr.length; i++){

            if(i%2!=0){

                arr[i] = 0;
            }
        }

        System.out.println("updated elements are");
        for(int i = 0 ; i<arr.length ; i++){

            System.out.println(arr[i]);
        }
        
        
    }
}
