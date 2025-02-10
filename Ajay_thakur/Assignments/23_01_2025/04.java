import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length(); i++){

            if(sb.charAt(i)>='0'&&sb.charAt(i)<='9'){

                sb.deleteCharAt(i);
                i--;
            }
            
        }


            System.out.println("new String is " + sb);
        
        
    }
}