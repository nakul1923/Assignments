/*

    A
   AB
  ABC
 ABCD
ABCDE



 */

class pattern10{
    public static void main(String[] args) {
        
        for(int i=65; i<=69;i++){

            for(int j = i; j<69; j++){

                System.out.print(" ");

            }

            for(int k = 65; k<=i; k++){

                System.out.print((char)k);
            }
            System.out.println();
            
            }
            
        }
    }
