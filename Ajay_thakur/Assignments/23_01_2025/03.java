import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length(); i++){

            for(int j=i+1; j<sb.length();j++){

                if(sb.charAt(i)==sb.charAt(j)){

                    sb.deleteCharAt(j);        
                    
                }
            }
        }


            System.out.println("new String is " + sb);
        
        
    }
}