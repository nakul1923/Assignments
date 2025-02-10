import java.util.*;

class InvalidAgeForDrivingLicenseException extends RuntimeException{

    InvalidAgeForDrivingLicenseException(String str){

        super(str);
    }
}

class InvalidMarkForDrivingLicenseException extends RuntimeException{

    InvalidMarkForDrivingLicenseException(String str){

        super(str);
    }
}


class Main{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter marks");
        int mark= sc.nextInt();

        if(age<18&&age>0){

            throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
        } else if(age<0||age>100){

            throw new InvalidAgeForDrivingLicenseException("Invalid age");
        }

        if(mark<80&&mark>=0){

            throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
        }else if(mark>100||mark<0){

            throw new InvalidMarkForDrivingLicenseException("Invalid mark");
        }

        System.out.println("Approved");
    }
}