/*
 Check if two strings are anagrams using String.

Input:

Enter the first string: listen  
Enter the second string: silent

 */

class Main{

    public static void main(String[] args) {
        
        String s1 = "listen";
        String s2 = "silent";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int[] in1 = new int[ch1.length];
        int[] in2 = new int[ch1.length];

        int flag = 1;

        if(s1.length()!=s2.length()){

            flag = 0;
        } else{

        

        for(int i=0; i<ch1.length;i++){

            int temp1 = (int)ch1[i];
            int temp2 = (int)ch2[i];

            in1[i] = temp1;
            in2[i] = temp2;

            // System.out.println(in1[i]);
            // System.out.println(in2[i]);
        }

        for(int j=0;j<in1.length-1;j++){

            for(int k=0; k<in1.length-1-j;k++){

                if(in1[k]>in1[k+1]){

                    int temp = in1[k];
                    in1[k] = in1[k+1];
                    in1[k+1] = temp;
                }
            }
        }

        for(int j=0;j<in2.length-1;j++){

            for(int k=0; k<in2.length-1-j;k++){

                if(in2[k]>in2[k+1]){

                    int temp = in2[k];
                    in2[k] = in2[k+1];
                    in2[k+1] = temp;

                }
            }
        }

    

        for(int i = 0; i<ch1.length;i++){

            if(in1[i]!=in2[i]){

                flag = 0;
            }
        }
    }

        if(flag==0){

            System.out.println("Given String are not anagrams");
        } else{

            System.out.println("Given string are anagrams");
        }
    }


}