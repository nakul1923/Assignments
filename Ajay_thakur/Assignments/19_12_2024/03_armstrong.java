import java.util.Scanner;;
class Demo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter array size");

        int n = sc.nextInt();
        

        int arr[] = new int[n] ;

        System.out.println("enter elements");

        for(int i = 0 ; i<n ; i++){


                arr[i] = sc.nextInt();
            
        }

        System.out.print("Armstrong numbers present are " );

        for(int i=0 ; i<arr.length ; i++){

            int num = arr[i];
            int num1 = arr[i];
            int rem ;
            int count = 0 ;
            int sum = 0;

            while(num>0){

                count++;
                num = num/10;
            }

            while(num1>0){

                rem = num1 %10;
                int mul = 1;

                for(int j=0 ; j<count ; j++){

                    mul = mul * rem ;
                }

                sum = sum + mul ;
                num1 = num1/10 ;
            }

            if(arr[i]==sum){

                System.out.print(arr[i] + ", ");
            }
        }
        
    }
}.0