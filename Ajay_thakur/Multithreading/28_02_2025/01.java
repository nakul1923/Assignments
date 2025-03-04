/*
 * program to understand Multithreading 
 */

class Mythread extends Thread{

    public void run(){

        for(int i=0; i<60; i++){

            System.out.println("Mythread");
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