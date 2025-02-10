/*

ABCDE
ABCD
ABC
AB
A

 */

public class pr11 {
    public static void main(String[] args) {
        
        for(int i = 69 ; i>=65; i--){
            
            for(int j= 65; j<=i ; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}

