import java.util.Arrays;


class Main{

    public static void main(String[] args) {
        
        int[] arr = {34,35,546,45,34,43,5,6,645,4};

        Arrays.sort(arr);

        for(int i=arr.length-2;i>=0;i--){

            if(arr[arr.length-1]!=arr[i]){

                System.out.println(arr[i]);
                break;
            }
        }
    }
}