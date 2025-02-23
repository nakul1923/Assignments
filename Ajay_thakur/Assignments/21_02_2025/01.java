import java.util.Scanner;
import java.util.function.Predicate;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        Predicate<String> pr = s->{

            int countAtRate = 0;
            for(int i=0;i<s.length();i++){

                if(s.charAt(i)=='@'){

                    countAtRate++;
                }
            }
            if(s.endsWith(".com")&&countAtRate==1){

                return true;
            } else{

                return false;
            }
        };

        System.out.println(pr.test("nakul@.com"));
    }
}

