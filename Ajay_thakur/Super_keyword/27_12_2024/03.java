/*
 * program to implement Super keyword at Method level
 */

class A{

    void display(){

        System.out.println("this is A class");
    }
}

class B extends A{

   void display(){

    super.display();

    System.out.println("this is B class");
   }

   
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();
        obj1.display();
    }
}