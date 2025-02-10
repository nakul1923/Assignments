abstract class Appliance{

    String brand;
    boolean isOn;

    Appliance(String brand){

        this.brand = brand;
        isOn = false;
    }

    abstract void operate();

    void turnOn(){

        this.isOn = true;

        System.out.println("The appliance is now ON");

    }

    void turnOff(){

        this.isOn = false;

        System.out.println("The appliance is now OFF");
    }
}

class WashingMachine extends Appliance{

    WashingMachine(String brand){

        super(brand);
    }

    void operate(){

        System.out.println("The washing machine is washing clothes");
    }

    
    
}

class Refrigerator extends Appliance{

   public Refrigerator(String brand){

        super(brand);
    }

    void operate(){

        System.out.println("The refrigerator is cooling items");
    }
}

class Beta{

    public static void main(String[] args) {
        

        Appliance obj1 = new WashingMachine("Samsung");

        obj1.turnOn();
        obj1.operate();
        obj1.turnOff();

        Appliance obj2 = new Refrigerator("LG");

        obj2.turnOn();
        obj2.operate();
        obj2.turnOff();
    }
}