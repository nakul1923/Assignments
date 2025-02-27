class Main{

    public static void main(String[] args) {
        
        int[] arr = {34,35,546,600,600,700};

        int flag = 1;
        for(int i=0; i<arr.length-1;i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[i]){

                    flag = 0;
                    break;
                }
            }

            if(flag==0){

                break;
            }
        }

        if(flag==1){

            System.out.println("Sorted");
        } else{

            System.out.println("NOT");
        }
    }
}