interface Calculator{

    static int add(int a, int b){

        return a+b;
    }

    default int subtract(int a, int b){

        return a-b;
    }
}

class BasicCalculator implements Calculator{


}

class Main{

    public static void main(String[] args) {
        
        System.out.println(Calculator.add(10,20)); 

        Calculator obj1= new BasicCalculator();

        System.out.println(obj1.subtract(20, 10)); 
    }
}