package cusexp;

public class InvalidDomainNameException extends Exception{

	String erroDomain;

	public InvalidDomainNameException(String erroMsg) {
		super();
		this.erroDomain = erroMsg;
	}
	
	public String displayMsg()
	{
		return "MyBusiness App Does Not Support "+erroDomain;
	}

	@Override
	public String toString() {
		return "InvalidDomainNameException [erroDomain=" + erroDomain + "]";
	}
	
	
}
