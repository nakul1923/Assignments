/*
 * Program to implement join method
 * 
 * join() - in case of interdependency join() method is used. if a threads wants to wait until completion of some other thread then we use join().

Suppose we have two threads if one thread wants to wait until completion of another thread then the thread has to write join() method.
 */

class Mythread extends Thread{

    public void run(){

        for(int i=0; i<20; i++){

            System.out.println("Mythread");
            
            try{

                Thread.sleep(1000);
            } catch(InterruptedException ee){


            }
        }
        
    }
}

class Main{

    public static void main(String[] args) throws InterruptedException {
        
        Mythread t = new Mythread();
        t.start();
        t.join();                     //We can also pass time in join like join(2000) means it will now only wait for 2 sec then it will execute

        for(int i=0; i<60; i++){

            System.out.println("Main");

        }
        
    }
}