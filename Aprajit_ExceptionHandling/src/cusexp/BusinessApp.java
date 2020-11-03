package cusexp;

public class BusinessApp {

	public boolean ValidateEmail
	(String userEmail)
			throws InvalidDomainNameException
	{
		if(userEmail.endsWith("gmail.com"))
		{
			//valid
			return true;
		}
		else
		{
			String arr[] = userEmail.split("@");
			throw new InvalidDomainNameException(arr[1]);
		}
	}
	
}
