interface I1{

    public int fact(int n);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = n->{

            int fact = 1;

            for(int i=1; i<=n; i++){

                fact = fact * i;
            }

            return fact;
        };

        System.out.println(obj.fact(6)); 
    }
}
