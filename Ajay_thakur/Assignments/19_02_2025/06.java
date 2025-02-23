interface I1{

    public String concat(String s1, String s2);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = (s1,s2)->s1+" " +s2;

        System.out.println(obj.concat("i love", "java")); 
    }
}