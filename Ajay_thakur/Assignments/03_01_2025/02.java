class Animal{

    void makeSound(){

        System.out.println("Some generic sound");
    }
}

class Dog extends Animal{

    void makeSound(){

        System.out.println("woof woof");
    }
}

class cat extends Animal{

    void makeSound(){

        System.out.println("Meow Meow");
    }
}

class Beta{

    public static void main(String[] args) {
        
        Animal ob1 = new Dog();
        ob1.makeSound();

        Animal ob2 = new cat();
        ob2.makeSound();
    }
}