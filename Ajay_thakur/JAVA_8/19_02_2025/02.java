interface I1 {

    public void m1();
}


class Main{

   public static void main(String[] args) {
       
       I1 obj = ()->System.out.println("hello guys");
       obj.m1();
   }
}