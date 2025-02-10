import java.util.Scanner;
import java.util.*;
class Test{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter no.");
String num = sc.next();
int len = num.length();
int check = 0;


/*char ch[] = num.toCharArray();
for(int i =0; i<ch.length; i++){
int n = Integer.parseInt(ch[i]);
int total = n*len;
System.out.println("n "+n);
check +=total;
}*/

for(int i =0; i<num.length(); i++){
String s = ""+num.charAt(i);
int n = Integer.parseInt(s);
int total = (int)Math.pow(n,len);
System.out.println("n "+n);
check +=total;
}
System.out.println("Enter no = "+num);
System.out.println("check = "+check);
}
}