import java.util.*;


class Main{

	
	static void validateGrade(String name,int grade){

		if(grade<0||grade>100){
			
			try{
				throw new IllegalArgumentException("please enter valid grade");
			} catch(IllegalArgumentException ee){

				System.out.println(ee);
			}
			
		}

		System.out.println("Grade for Student " + name +" is " + grade);

		

	}

	public static void main(String []args){

	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter name of Student");
		String name = sc.nextLine();
		System.out.println("Enter Grade");
		
		try{

			int grade = sc.nextInt();
			validateGrade(name,grade);

		} catch(InputMismatchException rr){
			
			rr.printStackTrace();

		}

		
		

	}

}