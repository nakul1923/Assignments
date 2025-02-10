class Vehicle{

    void speed(){

        System.out.println("Speed varies for different vehicles");
    }
}

class Car extends Vehicle{

    void speed(){

        System.out.println("the car speed is 120km/h");
    }
}

class Bike extends Vehicle{

    void speed(){

        System.out.println("The bike speed is 80km/h");
    }
}

class Beta{

    public static void main(String[] args) {
        
       Vehicle ob1 = new Vehicle();
       ob1.speed();

       Vehicle ob2 = new Car();
       ob2.speed();

       Vehicle ob3 = new Bike();
       ob3.speed();
    }
}