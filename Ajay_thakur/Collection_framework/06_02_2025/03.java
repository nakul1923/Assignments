import java.util.*;

class Main{

    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();

        l.add("rashmika");
        l.add("deepika");
        l.add("katappa");
        l.add("bahubali");
        
        System.out.println(l);

        ListIterator itr = l.listIterator();

        while(itr.hasNext()){

            String i = (String)itr.next();

            if(i.equals("rashmika")){

                itr.remove();
            } else if(i.equals("deepika")){

                itr.add("shivgami");
            } else if(i.equals("katappa")){

                itr.set("bhalladlev");
            }

            
        }
        System.out.println(l);
    }
}