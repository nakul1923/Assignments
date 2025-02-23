import java.util.function.*;

class Main{

    public static void main(String[] args) {
        
        Predicate<String> pr = s->{

            StringBuilder sb =  new StringBuilder(s);

            String rev =  new String(sb.reverse());

            if(s.equals(rev)){

                return true;
            } else {

                return false;
            }
        };

        System.out.println(pr.test("naman"));
    }
}