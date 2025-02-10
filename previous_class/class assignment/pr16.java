public class pr16 {
    public static void main(String[] args) {
        int datacount = 1;

        while(datacount <= 6){

            if (datacount % 2 == 0){
                System.out.println("First set");
            }
            else if (datacount % 3 == 0){
                System.out.println("Second set");
            } else{
                System.out.println("Third set");
            }
            datacount++;
        }
    }
}
