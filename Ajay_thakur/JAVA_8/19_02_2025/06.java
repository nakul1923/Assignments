interface Square {

    public int square(int n);
}

class Main{

   public static void main(String[] args) {
       
       Square obj = (n)->{

           System.out.println("Lunch Time");
           return n*n;
       };

       System.out.println(obj.square(5));
   }
}