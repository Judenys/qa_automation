package java_package;

public class exceptionErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try
		{
			int i = 1/0;
		}
	catch(ArithmeticException e)
		{
			System.out.println("This can’t be divided");
		}
	}

}
