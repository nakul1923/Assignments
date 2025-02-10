import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("nakul");
        list.add("aaditya");
        list.add("rakesh");
        list.add("anil");

        for(int i=0;i<list.size();i++){

            if(list.get(i).startsWith("a")){

                list.set(i, list.get(i).toUpperCase());
            }

            System.out.println(list.get(i));
        }
    }
}