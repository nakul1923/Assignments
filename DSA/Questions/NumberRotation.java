class Main{

    public static void main(String[] args) {
        
        int num = 1234567;
        int k = -3;
        int temp = num;
        int cod = 0;

        while(temp>0){

            temp = temp/10;

            cod++;
        }

        if(k<0){

            k = k+cod;
        }

        int rem = 1;
        int mult = 1;

        for(int i = 1; i<=cod ; i++){

            if(i<=k){

                rem = rem*10;
            } else{

                mult = mult *10;
            }
        }

        System.out.println(mult);
        int q = num%rem;

        System.out.println(q);
        int r = num/rem;

        
        num = q * mult + r;

        System.out.println(num);

       
    }
}