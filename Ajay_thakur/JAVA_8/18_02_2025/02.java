
 /*
  * We can have n number of default methods in funtional interface
  */
 @FunctionalInterface  
 interface RBI{
 
     void hello();
     
     default void bye(){

        System.out.println("byeee");
     }
 }