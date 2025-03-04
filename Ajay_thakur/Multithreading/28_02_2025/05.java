/*
 * program to implement yield() method
 * 
 * yield() - it is static method in thread class.

suppose there are many threads existing and the first thread is taking lot of time, but second thread wants to take less time to complete.

Whenever yield() method is execute then the current thread execution will be paused to give the chance to another thread.
 */

 class Mythread extends Thread{

    public void run(){

        for(int i=0; i<60; i++){

            System.out.println("Mythread");
            Thread.yield();
        }
        
    }
}

class Main{

    public static void main(String[] args) {
        
        Mythread t = new Mythread();
        t.start();

        for(int i=0; i<60; i++){

            System.out.println("Main");

        }
        
        
    }
}