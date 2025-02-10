/*
 * Program to implement 2D array and print element
 */

class Demo {
    
    public static void main(String[] args) {
        
        int a[][] = {{2,3,4},{3,5,6}};

        for(int i = 0; i<2 ; i++){

            for(int j= 0 ; j<3 ; j++){

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
