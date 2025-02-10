import java.util.*;

class DotException extends RuntimeException{

	DotException(String str){
	
		super(str);
	}
}

class AtTheRateException extends RuntimeException{

	AtTheRateException(String str){
	
		super(str);
	}
}

class DomainException extends RuntimeException{

	DomainException(String str){
	
		super(str);
	}
}

public class Password{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your email");
		String email = sc.nextLine();

		int countDot = 0;
		int countAtRate = 0;

		for(int i=0; i<email.length();i++){
			
			if(email.charAt(i)=='.'){

				countDot++;
			}

			if(email.charAt(i)=='@'){

				countAtRate++;
			}

		}

		if(countDot==1&&countAtRate==1&&(email.contains(".com")||email.contains(".in")||email.contains(".net")||email.contains(".biz"))){

			System.out.println("Valid");

		}

		
		if(countDot!=1){

			throw new DotException("Invalid dot usage");
		}

		if(countAtRate!=1){

			throw new DotException("Invalid @ usage");
		}

		
		if(email.contains(".com")==false&&email.contains(".in")==false&&email.contains(".net")==false&&email.contains(".biz")==false){

                throw new DomainException("Invalid Domain");

               }

	}

}