/*
 * some method and their use  
 * 
 * 
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
        
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("parent");
        System.out.println(Thread.currentThread().getName());
    }
}