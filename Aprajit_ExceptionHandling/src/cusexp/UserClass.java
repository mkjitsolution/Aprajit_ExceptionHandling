package cusexp;

import java.util.Scanner;

public class UserClass {

	Scanner sc = new Scanner(System.in); // in ref to standard input device : keyboard 
	  // if we want to use Bar-code Scanner  , we have to Bar Code scanner ref 
	
	BusinessApp app = new BusinessApp();
	
	public static void main(String[] args) {
		
		UserClass user = new UserClass();
		try
		{
			user.enterEmailId();
		}
		catch(InvalidDomainNameException e)
		{
			System.out.println(e);
			System.out.println(" ----------------------");
			System.out.println(e.displayMsg());
			System.out.println(" ----------------------");
			e.printStackTrace();
		}
		
	}
	
	public void enterEmailId()throws InvalidDomainNameException
	{
		System.err.println("Enter Email");
		String email = sc.nextLine(); // ashish@gmail.com
		boolean flag = app.ValidateEmail(email);
		
		if(flag == true)
		{
			getEmails();
		}
		
	}
	
	public void getEmails()
	{
		System.out.println("Fetch emails from Database and render to user");
	}
	
}//end class
