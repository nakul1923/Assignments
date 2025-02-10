import java.util.Scanner;

class Demo {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println(id + ":" + name + ":");
    }
}
