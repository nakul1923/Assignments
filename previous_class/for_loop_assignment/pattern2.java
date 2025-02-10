
/*

    A
   AB
  ABC
 ABCD
ABCDE


 */

class pattern2{
    public static void main(String[] args) {
        
        for(int i=65; i<=69;i++){

            for(int j = 69; j>i; j--){

                System.out.print(" ");

            }
            for(int k = 65; k<=i; k++){
                System.out.print((char)(k));
            }
            System.out.println();
        }
    }
}