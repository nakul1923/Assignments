/*
 * program to implement functional interface in multithreading
 */

class Main{

    public static void main(String[] args) {
        
        Runnable r = ()->{

            System.out.println("run");
        };

        Thread t = new Thread(r);
        t.start();  

        for(int i=0; i<60; i++){

            System.out.println("main");
        }
  }
}