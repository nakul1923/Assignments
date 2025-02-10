import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        String[] strArr = new String[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter Name of the students");

        for(int i=0; i<10; i++){

            
            strArr[i] = sc.nextLine();
            
        }

        System.out.println("Names of the Students are : ");

        for(int i=0; i<10; i++){
            
            System.out.print(strArr[i] + ",");
        }
    }
}