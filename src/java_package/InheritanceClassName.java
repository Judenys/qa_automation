package java_package;

public class InheritanceClassName {
	
	void deposit(int a)
	{
		System.out.println("The deposit value is "+a);
	}

	void deposit(int a, int b)
	{
		int sum = a+b;
		System.out.println("The deposit value is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BankDetails obj = new BankDetails();
		obj.AcctHolder();
		obj.BankName();
		
		// In this part we are doing method overloading
		InheritanceClassName obj1 = new InheritanceClassName();
		obj1.deposit(1000);
		obj1.deposit(1000, 2000);
	}
	
}


class Bank
{
	void BankName()
	{
		System.out.println("The name of bank is CitiBank");
	}
}


class BankDetails extends Bank
{
	void BankName()
	{
		System.out.println("The name of bank is BOA");
	}
	
	void AcctHolder()
	{
		System.out.println("The account holder name is Judy");
	}
}