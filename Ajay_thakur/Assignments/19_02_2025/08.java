interface I1{

    public String upCase(String s);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = s->s.toUpperCase();

        System.out.println(obj.upCase("radhe radhe"));
    }
}