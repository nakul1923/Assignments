interface I1{

    public int len(String s);
 }

 class Main{

    public static void main(String[] args) {
        
        I1 obj = x->x.length();

        System.out.println(obj.len("nakul"));
    }
 }