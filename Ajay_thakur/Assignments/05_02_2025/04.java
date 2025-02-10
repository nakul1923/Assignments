import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class a {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();

        Collections.addAll(l, 1,2,3,4,5);

        Iterator itr = l.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        
    }
}
