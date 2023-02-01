package java_package;

public class customerClassWith4Objects {
	String name;
	String sex;
	String address;
	int ssn;
	void fee_paid_amount(int fee)
	{
		System.out.println("Pay the fee amount $: "+fee);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerClassWith4Objects obj1= new customerClassWith4Objects();
		obj1.name= "Regina";
		obj1.sex= "Female";
		obj1.address= "Testing";
		obj1.ssn= 88899900;
		
		
		System.out.println("Name of customer #1: "+obj1.name);
		System.out.println("Sex of customer #1: "+obj1.sex);
		System.out.println("Address of customer #1: "+obj1.address);
		System.out.println("The SSN of customer #1: "+obj1.ssn);
		obj1.fee_paid_amount(400);
		System.out.println(System.lineSeparator());
		
		customerClassWith4Objects obj2= new customerClassWith4Objects();
		obj2.name= "Fidelis";
		obj2.sex= "Male";
		obj2.address= "Testing2";
		obj2.ssn= 33778890;

		
		System.out.println("Name of customer #2: "+obj2.name);
		System.out.println("Sex of customer #2: "+obj2.sex);
		System.out.println("Address of customer #2: "+obj2.address);
		System.out.println("The SSN of customer #2: "+obj2.ssn);
		obj2.fee_paid_amount(200);
		System.out.println(System.lineSeparator());
		
		customerClassWith4Objects obj3= new customerClassWith4Objects();
		obj3.name= "Laxmi";
		obj3.sex= "Female";
		obj3.address= "Testing3";
		obj3.ssn= 77778890;
		
		System.out.println("Name of customer #3: "+obj3.name);
		System.out.println("Sex of customer #3: "+obj3.sex);
		System.out.println("Address of customer #3: "+obj3.address);
		System.out.println("The SSN of customer #3: "+obj3.ssn);
		obj3.fee_paid_amount(300);
		System.out.println(System.lineSeparator());
		
		customerClassWith4Objects obj4= new customerClassWith4Objects();
		obj4.name= "Usman";
		obj4.sex= "Male";
		obj4.address= "Testing4";
		obj4.ssn= 883390890;
		
		System.out.println("Name of customer #4: "+obj4.name);
		System.out.println("Sex of customer #4: "+obj4.sex);
		System.out.println("Address of customer #4: "+obj4.address);
		System.out.println("The SSN of customer #4: "+obj4.ssn);
		obj4.fee_paid_amount(400);
		System.out.println(System.lineSeparator());
	}

}
