import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(20);

        list.set(1, 25);
        list.remove(2);

        System.out.println(list);
    }
}