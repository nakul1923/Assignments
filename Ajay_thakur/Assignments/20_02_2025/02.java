interface I1{

    public int vowelCount(String s);

}

class Main{

    public static void main(String[] args) {
        
        I1 obj = s->{

            int count = 0;

            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){

                    count ++;
                }
            }

            return count;
        };

        System.out.println(obj.vowelCount("nakul panchal"));
    }
}