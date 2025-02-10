/*
 * 
 * program to implement array and print the array values using while loop and exploring .length
 */

class Beta {

    public static void main(String[] args) {
        
        System.out.println("Array Demo");

        int x[] = {10,20,30};

        System.out.println(x.length);

        int i= 0 ;

        while(i<x.length){

            System.out.println(x[i]);
            i++;
        }
    }
}