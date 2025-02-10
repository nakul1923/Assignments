/*

1/1+1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10
sum = 2.9289684


 */

public class pr2 {

    public static void main(String[] args) {
        
    int i = 1 ;
    float sum = 0;

    while(i<=10){
        if(i==10){
            System.out.print(1 + "/" + i);
        }
        else{
            System.out.print(1 + "/" + i + "+");
        }
       
        sum = sum + (1.0f/i);
        i++;
    }
    System.out.println();
    System.out.println("sum = " + sum);
}
}
    