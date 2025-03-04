class Main{

    public static void printFib(int a, int b, int n){

        if(n==0){

            return;
        }
        
        System.out.println(a);

        int sLast = b;
        int next = a+b;
        
        printFib(sLast, next,n-1 );


    }
    public static void main(String[] args) {
        
        printFib(0, 1, 10);
    }
}