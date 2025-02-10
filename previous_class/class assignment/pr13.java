/*
 * WAP to find the areas of some shapes using switch case
 */

import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1. Area of Rectangle \n2. Area of Circle \n3. Area of square");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("you select Area of Rectangle now enter the length and breadth respectively :");
                     System.out.println("Enter length : ");
                     int l = sc.nextInt();
                     System.out.println("Enter breadth");
                     int b = sc.nextInt();

                     int area = l * b;
                     System.out.println("Area fo Rectangle is : " + area);
            break;

            case 2 : System.out.println("you select Area of circle now enter some input");
                     System.out.println("enter radius");
                     double r = sc.nextInt();
                     double pie = 3.14;
                     double area1 = pie * r *r ;
                     System.out.println("Area of circle is : " + area1);
            break;

            case 3 : System.out.println("you select Area of square now input side of square");
                     System.out.println("Enter side of square");
                     int side = sc.nextInt();
                     int area2 = side * side ;
                     System.out.println("Area of square is : " + area2);
            break;

            default: System.out.println("wrong input! ");
        }


    }
}
