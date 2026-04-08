import java.util.Scanner;

public class SigmaChaseClass {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String choice; 
		boolean loop = true;
		System.out.println("hello and welcome to the Codd Registration Agency");

		System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("1.add Student");
		System.out.println("2.add Course");
		System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("3.View all Students");
		System.out.println("4.View all Courses");
		System.out.println("~-~-~-~-~-~-~-~-");
		System.out.println("5.|~>Exit<~|");
		System.out.println("~-~-~-~-~-~-~-~-");

		while(loop==true) {
			choice = console.nextLine();
			if(choice.equals("1")) {
				System.out.println("Student added");	
			}
			else if(choice.equals("2")) {
				System.out.println("Course added");
			}

			else if(choice.equals("3")) {
				System.out.println("view students");
			}

			else if(choice.equals("4")) {
				System.out.println("view courses");	
			}
			else if(choice.equals("5")) {
				System.out.println("you have exited");    
			}
			else {
				System.out.println("uh oh, not a real answer");	
			}
		}
	}

}
