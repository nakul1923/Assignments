class Main{

    public static void main(String[] args) {
        
        int num = 100;

        int on ;

        int off;

        for(int i=1; i<=100; i++){

            for(int j =1 ; j<=100;j++){

                if(j%i==0){

                    System.out.print(j+" ,");
                }
            }

            System.out.println();
        }
    }
}