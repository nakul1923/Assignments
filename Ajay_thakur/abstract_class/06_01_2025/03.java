abstract class RBI{

    abstract public void roi();

    abstract void kyc();

}

abstract class SBI extends RBI{

    public void roi(){

        System.out.println("9%");
    }
}

class SBIBranch extends SBI{

    void kyc(){

        System.out.println("done");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        // RBI obj1 = new RBI();
        // SBI obj1 = new SBI();

        RBI obj1 = new SBIBranch();

        obj1.roi();
        obj1.kyc();
    }
}