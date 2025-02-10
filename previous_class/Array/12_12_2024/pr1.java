

public class pr1 {
    
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6}};

        for(int i=0; i<2 ; i++){

            for(int j = 0 ; j<3; j++){

                System.out.print("Element a[" + i + "][" + j + "] = " + a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
