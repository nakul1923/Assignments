import java.util.PriorityQueue;

class Main{

    public static void main(String[] args) {
        
        PriorityQueue<Integer> p = new PriorityQueue<>();

        System.out.println(p.peek());

        System.out.println(p.poll());

        p.offer(10);
        p.offer(20);
        p.offer(30);

        System.out.println(p);
        System.out.println(p.poll());
    }
}