/*

1+2+3+4+5+6+7+8+9+10

sum = 55

 */

public class pr1 {

    public static void main(String[] args) {
        
    int i = 1 ;
    int sum = 0;

    while(i<=10){
        if(i==10){
            System.out.println(i);
        } else{
            System.out.print(i +"+");
            
        }
        sum = sum + i;
        i++;
    }
    System.out.println();
    System.out.println("sum = " + sum);
}
}
    
    
