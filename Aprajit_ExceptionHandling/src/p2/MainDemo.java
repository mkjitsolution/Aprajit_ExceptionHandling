package p2;

import java.io.*;

public class MainDemo {

	public static void main(String[] args) {

		MainDemo obj = new MainDemo();
		
		obj.solution1();
		
		try {
			obj.solution2();
		} catch (FileNotFoundException e) {
			System.out.println("Inside Main Invalid File "+e.getMessage());
		}
	}
	
	// calling a Check exception 
	public void solution1()
	{
		try
		{
			FileReader f = new FileReader(new File("xyz.txt"));
		}
		catch(FileNotFoundException abc)
		{
			System.out.println("Inside Solution1 : "+abc);
		}
	}
	public void solution2()throws FileNotFoundException
	{
		FileReader f = new FileReader(new File("xyz.txt"));
		
	}
	
}//end class
