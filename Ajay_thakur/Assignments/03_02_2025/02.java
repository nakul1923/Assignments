import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        for(int i=0;i<list.size();i++){

            if(list.get(i)%2==0){

                System.out.println(list.get(i));
                
            }

            
        }
    }
}