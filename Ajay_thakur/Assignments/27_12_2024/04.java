class Vehicle{

    Vehicle(String vehicleType){

        System.out.println(vehicleType);
    }
}

class Car extends Vehicle{

    Car(String vehicleType,String brand){

        super(vehicleType);
        System.out.println(brand);
    }
}

class Main{

    public static void main(String[] args) {
        
        Car obj1 = new Car("car", "Toyota");
    }
}