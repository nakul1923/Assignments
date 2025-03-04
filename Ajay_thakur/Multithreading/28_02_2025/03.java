
/*
 * Another way of creating thread.

by using Runnable interface we can achieve multithreading in java.

Runnable is a interface present in java.lang package it contains only one method called run method.
 */

 class Mythread implements Runnable{

    public void run(){

        for(int i=0; i<60; i++){

            System.out.println("Mythread");
        }
    }

}

class Main{

    public static void main(String[] args) {
        
        Mythread t = new Mythread();
        Thread t1 = new Thread(t);

        t1.start();
        for(int i=0; i<60; i++){

            System.out.println("Main");
        }
    }
}