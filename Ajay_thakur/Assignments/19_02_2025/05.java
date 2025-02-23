interface I1{

    public boolean palindrome(String s);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = s->{

            StringBuffer s1 = new StringBuffer(s);

            String rev = s1.reverse().toString();

            if(s.equals(rev)){

                return true;
            } else{

                return false;
            }
        };

        System.out.println(obj.palindrome("nakul")); 
    }
}