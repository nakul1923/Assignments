/*
 * Anagram again
 */

 class Main{

    public static void main(String[] args) {
        
        String s1 = "iceman";
        String s2 = "cinema";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int flag = 1;

        if(s1.length()!=s2.length()){

            flag = 0;
        } else{

            for(int i=0;i<ch1.length-1;i++){

                for(int j = 0; j<ch1.length-1-i;j++){
    
                    if(ch1[j]>ch1[j+1]){
    
                        char temp1 = ch1[j];
                        ch1[j] = ch1[j+1];
                        ch1[j+1] = temp1;
    
                        char temp2 = ch2[j];
                        ch2[j] = ch2[j+1];
                        ch2[j+1] = temp2;
                    }
                }
            }
    
            for(int i = 0; i<ch1.length;i++){
    
                if(ch1[i]!=ch2[i]){
    
                    flag = 0;
                }
            }
    
            if(flag==0){
    
                System.out.println("Given String are not anagrams");
            } else{
    
                System.out.println("Given string are anagrams");
            }

        }

        
    }
 }