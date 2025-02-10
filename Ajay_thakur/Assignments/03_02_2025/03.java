import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(12);
        list.add(28);
        list.add(496);
        list.add(196);

        for(int i=0;i<list.size();i++){

            int num = list.get(i);
            int sum = 0;
            for(int j = 1;j<list.get(i);j++){

                
                if(num%j==0){

                    sum += j;
                }
            }

            if(sum==num){

                System.out.println(list.get(i));
            }

            
        }
    }
}