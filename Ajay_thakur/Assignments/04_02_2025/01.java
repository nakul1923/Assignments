import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("Enter 5 numbers");

        for(int i = 0; i<5;i++){

            list.add(sc.nextInt());
            
        }

        System.out.println(list.contains(5));
        list.remove(Integer.valueOf(20));

        System.out.println(list);

        for(int i = 0;i<list.size()-1;i++ ){

            int max = list.get(i);
            for(int j = i+1;j<list.size();j++){

                if(max<list.get(j)){

                    max = list.get(j);
                }
            }

            System.out.println(max);
        }

    }
}