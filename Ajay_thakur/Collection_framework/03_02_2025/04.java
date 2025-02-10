import java.util.ArrayList;
import java.util.List;

class Main{

    public static void main(String[] args) {
        
        
        List<String>l = new ArrayList<String>();

        l.add("rashmika");
        l.add("abc");
        l.add("nakul");
        l.add("rashmika");

        System.out.println(l);

        for(String s:l){

            if(s.startsWith("r")){

                System.out.println(s);
            }
            
        }
        
    }
}