package inhExp;

import chainexp.*;

class Employee 
{
	public void doThings()throws MyException2
	{	}
}//end class

class Accountant extends Employee
{
   // Rule is during override we can add any new child class , but cannot add super class - Exception
  // We can add any new Runtime Exception 	
	public void doThings() throws MyException2,MyException3, NullPointerException,ClassCastException 
	{
	}
	
}

public class DemoClass {

}
