import java.util.ArrayList;
import java.util.*;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name to search");
        String name = sc.nextLine();
        
        ArrayList<String> list = new ArrayList<>();

        list.add("nakul");
        list.add("aaditya");
        list.add("rakesh");
        list.add("anil");
        list.add("rashmika");

        for(int i=0;i<list.size();i++){

            if(list.get(i).equals(name)){

                System.out.println("YES it is present at index: " + i);
                break;
            }
        }
    }
}