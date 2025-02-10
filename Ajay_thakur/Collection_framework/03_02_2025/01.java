import java.util.ArrayList;
import java.util.List;

class Main{

    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(0,99);
        System.out.println(l);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.addAll(l);
        System.out.println(l2);

        System.out.println(l2.contains(99));
        System.out.println(l.containsAll(l2));

        System.out.println(l2.isEmpty());
    }
}