

public class pr1 {
    public static void main(String[] args) {
        
        int a = 0 ;
        int b = 1 ;
        int n = 10 ; 

        System.out.print(a + ", ");
        System.out.print(b + ", ");

        for(int i = 1; i<=10-2 ; i++){

            int c = a+b;

            a = b ;
            b = c ;

            System.out.print(c + ", ");
        }
    }
}
