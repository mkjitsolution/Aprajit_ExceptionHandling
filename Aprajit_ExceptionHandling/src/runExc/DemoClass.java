package runExc;
/*
 1. NullPointerException  :- Calling . operator over null
 2. ClassCastException
 3. ArithmaticException  :- Divide by Zero
 4. ArrayIndexOutofBound  :- int arr[5]  arr[-1] : exception
    4.b) StringIndexOutOfBoundException  
 5. NumberFormatException
  
  */

class Animal
{}
class Dog extends Animal{}
class Cat extends Animal{}
public class DemoClass {

	public static void main(String[] args) {
		
	}
	
	public void demo2()
	{
		Animal a = new Dog();
		// in step 2 --> we are typecasting dog to cat
		Cat c = (Cat)a; // code leads to ClassCastException
	}
	
	public void demo4b()
	{
		String str = "abc";
		char x = str.charAt(1455);  // leads to an exception : StringIndexOutOfBoundException
	}
	
	public void demo5()
	{
		String str = "1";
		int x = Integer.parseInt(str); // int 1
		
		// but insted of numric 1 we have one 
		String str2 = "one";
		int x2 = Integer.parseInt(str2); // leads to NumberFormatException
		
	}
	
	
}
