package Flow;

import java.util.Scanner;

import UseCase.InsertStudentDetailsUseCase;
import UseCase.login;
import exceptions.StudentException;

public class StudentFlow {

	public static void main(String[] args) throws StudentException {
		
//		try {
			System.out.print("          ");
			String str = "Welcome  to  Student  Management  System";
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
//				Thread.sleep(100);
			}
			System.out.println();
			System.out.print("        ");
			System.out.print("============================================");	
			System.out.println();
			

			String str1 = "Please choose one option : ";
			for(int i=0; i<str1.length(); i++) {
				System.out.print(str1.charAt(i));
//				Thread.sleep(100);
			}
			System.out.println();
			
//---------------- OPTION CHOOSE FOR LOGIN AND REGISTER ---------------------------------------------
			
			System.out.println("1. Register as a new student");
			System.out.println("2. Login");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
		//---------------- FOR  REGISTER ----------------------------------------
			if(a == 1) {
				System.out.println("Please enter your details here : ");
				boolean b1 = InsertStudentDetailsUseCase.main(null);
				if(b1) {
					System.out.println("  Press 1 to login  ");
					System.out.println("  Press 0 to exit  ");
					int a1 = sc.nextInt();
					if(a1 == 0) {
						StudentFlow.main(null);
					}
					else {
						login.main(null);   //----------------login
					}
				}
			}
			//---------------- FOR  LOGIN -----------------------------------------------------
			else {
				System.out.println("Please enter your details here : ");
				boolean b2 = login.main(null);
				
				//----------------AFTER  LOGIN-------------------------------------
				if(b2) {
					int i = sc.nextInt();
					switch(i) {
					case 1 : System.out.println("Show all your details");
					
					case 2 : System.out.println("Update details");
					
					case 3 : System.out.println("Log out");
							StudentFlow.main(null);
					}
				}
			}
			
//		} 
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
