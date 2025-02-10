/*
 * 
 * program to implement for each loop in double data type
 */

class ForEachLoop {
    
    public static void main(String[] args) {
        
        double x[] = new double [3];

        x[0] = 20.65;
        x[1] = 30.54;
        x[2] = 40.55;

        for(double i:x){

            System.out.println(i);
        }
    }
}
