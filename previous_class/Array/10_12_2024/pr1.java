class pr1{

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        int temp=arr[1];

        arr[1] = arr[3];

        arr[3] = temp;

        for(int i = 0 ; i<arr.length; i++){

            System.out.println(arr[i]);
        }

        

        

        
    }
}