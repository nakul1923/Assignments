import java.util.*;

class UnderAgeException extends RuntimeException{

    UnderAgeException(String str){

        super(str);
    }
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = sc.nextInt();

        if(age<18||age>100){

            try{

                throw new UnderAgeException("you are not eligible for driving licence");
                
            } catch(UnderAgeException aa){

                System.out.println(aa);
            }
            
        } else{

            System.out.println("You are eligible for driving licence");
        }

        System.out.println("Done");

        
    }

}