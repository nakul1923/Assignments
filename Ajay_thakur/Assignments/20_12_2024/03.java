import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("enter array elements");

        for(int i = 0 ; i<5 ; i++){

            a[i] = sc.nextInt();
        }



        for(int i = 0 ; i<5; i++){

            int count = 0 ;
            

            while(a[i]>0){

                count++;
                a[i] = a[i]/10;
            }

            System.out.println("digits in a[" + i + "] is " + count);
        }


    }
}