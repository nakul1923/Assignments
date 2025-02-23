interface I1{

    public int countWords(String s);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = s->{

            int count = 0;
            String clean = s.replaceAll("\\s+", " ").trim();
            String[] words = clean.split(" ");

            for(String w:words){

                count++;
            }

            return count;
        };

        System.out.println(obj.countWords("my name is    nakul   panchal"));
    }
}