import java.util.Deque;
import java.util.LinkedList;

class Main{

    public static void main(String[] args) {
        
        Deque<Integer> p = new LinkedList<Integer>();

        p.offer(101);
        p.offer(10);
        p.offer(20);
        p.offer(30);

        System.out.println(p);

        System.out.println(p.poll());

        
    }
}