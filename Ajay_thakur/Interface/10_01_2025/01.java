/*
 * 
 * Program to implement default methods in interface
 */

interface RBI{

    void roi();

    default void kyc(){

        System.out.println("this is default behavior");
    }
}

class SBI implements RBI{

    public void roi(){

        System.out.println("8%");
    }

    public void kyc(){

        System.out.println("kyc done by sbi");
    }
}

class ICICI implements RBI{

    public void roi(){

        System.out.println("9%");
    }
}

class Beta{

    public static void main(String[] args) {
        
        RBI obj1 = new SBI();

        obj1.roi();
        obj1.kyc();

        RBI obj2 = new ICICI();

        obj2.roi();
        obj2.kyc();
    }
}