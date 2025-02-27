import java.util.ArrayDeque;
import java.util.Deque;


class Main{

    public static void main(String[] args) {
        
        Deque<Integer> p = new ArrayDeque<Integer>();

        p.offer(101);
        p.offer(10);
        p.offer(20);
        p.offer(30);

        System.out.println(p);

        p.addFirst(12);
        p.addLast(103);

        System.out.println(p);

        
    }
}