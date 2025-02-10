import java.util.*;

class Main{

public static boolean isArmstrongNumber(int num){

		int num1 = num,num2=num;
		int rem,count = 0,sum = 0;
	
		while(num>0){

			count ++;
			num = num/10;
		}

		while(num1>0){

			rem = num1%10;
			int mul = 1;
			
			for(int i=0; i<count; i++){

				mul = mul*rem;
			}

			sum = sum + mul;
			num1 = num1/10;
		}


		if(num2==sum){

		        return true;
		} else{
			return false;
		}
		
	

}

public static void main(String []args){
	
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	
	try{

		int num = sc.nextInt();

			if(num<0){

				try{

					throw new IllegalArgumentException("please enter positive number");

				}catch(IllegalArgumentException rr){

					System.out.println("Please enter positive number");
				}
			}
	
		System.out.println(isArmstrongNumber(num));
	} catch(InputMismatchException ee){
		
		System.out.println("Input must be a valid integer");
	}
	

}

}

