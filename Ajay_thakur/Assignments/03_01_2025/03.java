class Bank{

    int getInterestRate(){

        return 0;
    }
}

class SBI extends Bank{

    int getInterestRate(){

        return 5;
    }
}

class ICICI extends Bank{

    int getInterestRate(){

        return 6;
    }
}

class Axis extends Bank{

    int getInterestRate(){

        return 7 ;
    }
}

class Beta{

    public static void main(String[] args) {
        
        Bank ob1 = new SBI();
        System.out.println("Interest rate of SBI - " + ob1.getInterestRate());

        Bank ob2 = new ICICI();
        System.out.println("Interest rate of ICICI - " + ob2.getInterestRate());

        Bank ob3 = new Axis();
        System.out.println("Interest rate of Axis - " + ob3.getInterestRate());

        Bank ob4 = new Bank();
        System.out.println(ob4.getInterestRate());
    }
}