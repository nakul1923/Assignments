public class pr5{
    
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};

        int arr2[] = {6,7,8,9,10};

        int arr3[] = new int[10];

        int j = 0;
        int k = 0;

        for(int i = 0; i<arr3.length; i++){

            if(i%2==0){

                arr3[i] = arr1[j];

                j++;
            } 
            else{

                arr3[i] = arr2[k];

                k++;
            }
        }
        for(int i = 0; i<arr3.length; i++)
        {

            System.out.println(arr3[i]);
        }
    }
}