public class pr6{
    
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};

        int arr2[] = {6,7,8,9,10};

        int arr3[] = new int[10];

        for(int i = 0; i<arr3.length; i++){

            if(i<=4){

                arr3[i] = arr1[i];
            } 
            else{

                arr3[i] = arr2[i-5];
            }
        }
        for(int i = 0; i<arr3.length; i++)
        {

            System.out.println(arr3[i]);
        }
    }
}
