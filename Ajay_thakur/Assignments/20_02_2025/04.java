interface I1{

    public int sumOfDigit(int n);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = n->{

            int num = n;

            int sum = 0;

            while(num>0){

                int rem = num%10;

                sum = sum + rem;

                num = num/10;
            }

            return sum;
        };

        System.out.println(obj.sumOfDigit(123456));
    }
}