
 /*
  * We can have n number of private methods in functional interface
  */
  @FunctionalInterface  
  interface RBI{
  
      private void hello(){

      }
      
      void hii();

      static void bye(){
 
         System.out.println("byeee");
      }


  }