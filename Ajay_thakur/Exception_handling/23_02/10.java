/*
 * class cast exception
 */

class A{

    
}

class Demo1{

    public static void main(String[] args) {
        
        try{

            Object obj = new Object();

            A x = (A)obj;
        } catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }

        System.out.println("done");
    
    }
}