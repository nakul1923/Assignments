import java.util.Scanner;

class Student{

    int id;
    String name;
    Student(int id, String name){

        this.id = id;
        this.name=name;
    }

    void display(){

        System.out.println(id + ":" + name);
    }

}


class Beta{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x= Integer.parseInt(sc.nextLine());
        Student s[] = new Student[x];

        for(int i = 0; i<s.length; i++){

            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            s[i] = new Student(id,name);
        }

        for(Student y:s){

            System.out.println(y.id + ":" + y.name);
        } 
    }
}