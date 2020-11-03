package chainexp;

/* Chain Exception*/

public class Demo1 {

	public static void main(String[] args) {
		
	}
	public void doThings()throws MyException3
	{
		// rule is always catch child exception first 
		try
		{
			throw new MyException3();
		}
		catch(MyException3 e)
		{
			
		}
		catch(MyException2 e)
		{
			
		}
		catch(MyException1 e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}









