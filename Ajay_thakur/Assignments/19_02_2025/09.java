interface I1{

    public int max(int a, int b, int c);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = (a,b,c)->{

            if(a>b&&a>c){

                return c;
            } else if(b>c){

                return b;
            } else{

                return c;
            }
        };

        System.out.println(obj.max(20, 10, 30)); 
    }
}