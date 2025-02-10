import java.util.Scanner;

class Tata{

    String Brand;
    String model;
    String color;
    int year;

}

class Mercedes extends Tata{


}

class Ford extends Tata{

}

class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int s = Integer.parseInt(sc.nextLine());

        Ford f[] = new Ford[s];

        for(int i = 0 ; i<f.length ; i++){

            f[i] = new Ford();
            f[i].brand = sc.nextLine();
            f[i].model = sc.nextLine();
            f[i].color = sc.nextLine();
            f[i].year = Integer.parseInt(sc.nextLine());

        }

        for(Ford x:f){

            System.out.println(
            
            
            );
        }
    }
}