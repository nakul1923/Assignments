interface I1{

    public int[] fibSeries(int n);
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = n->{

            int first = 0;
            int second = 1;
            int[] series = new int[n];

            for(int i =1; i<=n; i++){

                series[i-1]=first;

                int next = first + second;
                first = second;
                second = next;
            }

            return series;
        };

        int series[] =  obj.fibSeries(10);

        for(int s:series){

            System.out.print(s+", ");
        }
    }
}