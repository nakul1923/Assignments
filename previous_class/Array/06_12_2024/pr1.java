class pr1 {
    
    public static void main(String[] args) {
        
        int arr[] = {20,25,26,15,10,4,10};

        int max = 0 ;

        for(int i = 0 ; i<=6; i++){

            if(arr[i]>max){

                max = arr[i];
            }
        }

        System.out.println("maximum = " + max);
    }
}


