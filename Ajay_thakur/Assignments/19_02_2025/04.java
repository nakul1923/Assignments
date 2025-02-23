interface I1{

    public int power(int base, int exponent);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = (base,exponent)->(int)Math.pow(base, exponent);

        System.out.println(obj.power(2, 6)); 
    }
}