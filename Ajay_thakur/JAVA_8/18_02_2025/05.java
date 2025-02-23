/*
 * this program giver error because in this child interface has now two abstract methods
 */

  @FunctionalInterface  
  interface RBI{
    
    void hii();

  }

  @FunctionalInterface
  interface SBI extends RBI{

    void bye();
  }