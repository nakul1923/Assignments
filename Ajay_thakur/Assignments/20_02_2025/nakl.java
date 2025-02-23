import java.util.function.Predicate;

class Main{

    public static void main(String[] args) {
        
        Predicate<String> obj = x->{

            if(x.length()>5){

                return true;
            } else{

                return false;
            }
        };

        System.out.println(obj.test("ajay"));
    }
}