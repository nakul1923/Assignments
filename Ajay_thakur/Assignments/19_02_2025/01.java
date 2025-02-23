interface I1{

    public String compare(int a, int b);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = (a,b)->{

            if(a>b){

                return "Greater";
            } else if(a<b){

                return "Smaller";
            } else{

                return "Equal";
            }
        };

        System.out.println(obj.compare(10, 20)); 
    }
}