
 /*
  * We can have n number of static methods in funtional interface
  */
  @FunctionalInterface  
  interface RBI{
  
      void hello();
      
      static void bye(){
 
         System.out.println("byeee");
      }
  }