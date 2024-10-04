package loginsystem;
import java.util.Scanner;
public class Userlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="your username";
		String password="your password";
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your username:");
		String inputyourusername=scanner.nextLine();
		
			  System.out.println("Enter your password:");	
			String inputyourpassword=scanner.nextLine();
			
			if(inputyourusername.equals(username)&& inputyourpassword.equals(password)) {
				
			System.out.println("login successfull!");
			}else {
				System.out.println("Login failed please try again.");
			}
			
			

	}

}
