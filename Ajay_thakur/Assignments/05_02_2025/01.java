/*
 * 
 Hospital Patient Management System
Scenario: A hospital maintains a list of patients using an ArrayList. Each patient has a patient ID, name, disease, and age. Implement:

Adding new patients
Displaying all patient records
Searching for patients by disease
Removing a discharged patient by ID
Finding the youngest patient

 */

import java.util.*;

class Hospital{

    String name;
    int id;
    String disease;
    int age;

    Hospital(String name,int id,String disease,int age){

        this.name = name;
        this.id = id;
        this.disease = disease;
        this.age = age;
    }

    public String toString(){

        return "Name : " + name + " id : " + id + " disease : " + disease + " age : " + age;
    }
}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Hospital> list = new ArrayList<>();

        list.add(new Hospital("Randy", 101, "TB", 36));
        list.add(new Hospital("Rock", 102, "Cancer", 48));
        list.add(new Hospital("John", 103, "jaundice", 28));
        list.add(new Hospital("Henry", 104, "Malaria", 34));
        
        list.add(new Hospital("Steve", 101, "Dengue", 52));
        

        for(Hospital patient:list){

            System.out.println(patient);
        }

        System.out.println("Search Patient by disease");
        String dis = sc.nextLine();
        for(int i=0;i<list.size();i++){

            

            if(list.get(i).disease.equals(dis)){

                System.out.println(list.get(i));
            }

        }

        System.out.println("Youngest patient : ");
        int ind = 0;
        int min = list.get(0).age;
        for(int i=1;i<list.size();i++){

            if(list.get(i).age<min){

                min = list.get(i).age;
                ind = i;
            }
        }

        System.out.println(list.get(ind));

        
        
    }
}