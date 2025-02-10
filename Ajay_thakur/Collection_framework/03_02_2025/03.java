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

            System.out.println(s);
        }

        for(int i=0;i<l.size();i++){

            // System.out.println(l[i]);
            System.out.println(l.get(i));
        }
        
    }
}