interface NumberInput{

    void input(int a);

}

interface AutomorphicChecker{

    void Checker();

}

class AutomorphicNumber implements NumberInput,AutomorphicChecker{

    int a;

    public void input(int a){
        this.a = a;
    }

    public void Checker(){

        int a = this.a;

        int n = a;

        int s = a*a;

        int rem = 1;

        int count = 0;

        while(n>0){

            count++;
            n = n/10;
        }

        for(int i=1; i<=count; i++){

            rem = rem *10 ;
        }

        if(s%rem == a){

            System.out.println("automorphic");
        } else{

            System.out.println("not");
        }
    }

}

class Main{

    public static void main(String[] args) {
        
        AutomorphicNumber obj1 = new AutomorphicNumber();

        obj1.input(376);
        obj1.Checker();
    }
}