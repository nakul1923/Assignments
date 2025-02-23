interface I1{

    public int square(int n);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = n->n*n;

        System.out.println(obj.square(5)); 
    }
}