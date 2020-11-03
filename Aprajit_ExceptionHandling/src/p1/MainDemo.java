package p1;

public class MainDemo {

	public static void main(String[] args) {

		int x = 10;// user input
		int y = 8; // user input

		System.out.println("A");
		try {
			String str = null;
			str.toCharArray();
			System.out.println(x / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Invalid value for y " + y);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

		System.out.println("B");

	}
}
