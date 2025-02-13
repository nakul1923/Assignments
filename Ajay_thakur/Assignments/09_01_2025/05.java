interface Principal{

    public void principal(double p);
}

interface InterestRate{

    public void interestRate(double r);
}

class Loan implements Principal,InterestRate{


    double principal;
    double rate;
    double time;
    public void principal(double p){

        this.principal = p;
    }

    public void interestRate(double rate){

        this.rate = rate;
    }

    public void getTime(double time){

        this.time = time;
    }

    public double totalInterest(){

        return principal*rate*time;
    }

}

class Main{

    public static void main(String[] args) {
        
        Loan l1 = new Loan();

        l1.principal(10000);
        l1.interestRate(5);
        l1.getTime(5);

        System.out.println(l1.totalInterest());
    }
}