class Main{

    public static void main(String[] args) {
        
        int[] arr = {16,17,4,3,5,2};

        for(int i=0; i<arr.length; i++){

            int flag = 1;
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]<arr[j]){

                    flag = 0;
                }
            }

            if(flag==1){

                System.out.print(arr[i] + ", ");
            }
        }
    }
}