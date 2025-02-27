import java.util.Arrays;

class Main{

    public static void main(String[] args) {
        
        int[] arr = {34,35,546,45,34,43,5,6,645,4};

        Arrays.sort(arr);

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i]>max1){

               max3 = max2;
               max2 = max1;
               max1 = arr[i];
            } else if(arr[i]>max2&&arr[i]!=max1){

                max3 = max2;
                max2 = arr[i];
            } else if(arr[i]>max3&&arr[i]!=max1&&arr[i]!=max2){

                max3 = arr[i];
            }
        }

        System.out.println(max1 + " " + max2 + " " +  max3);
    }
}