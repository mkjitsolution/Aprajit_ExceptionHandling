package p2;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class Animal{}

public class MainClass2 {

	public static void main(String[] args) {
		
		MainClass2 obj = new MainClass2();
		try {
			Animal a = null;
			obj.caller1(a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void caller1(Animal a)throws FileNotFoundException
	{
		// 1000 line of code
		caller2(a);
	}
	public void caller2(Animal a)throws FileNotFoundException
	{
		// 1000 line of code
		doThings(a);
	}
	public void doThings(Animal a)throws FileNotFoundException,NullPointerException
	{
		
		a.toString();
	}
}
