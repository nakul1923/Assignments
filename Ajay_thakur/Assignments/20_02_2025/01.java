interface I1{

    public String reverseString(String s);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = s->{

            StringBuffer sb = new StringBuffer(s);
            return sb.reverse().toString();

        };

        System.out.println(obj.reverseString("hello guys"));
    }
}