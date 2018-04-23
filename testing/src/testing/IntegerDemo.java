package testing;

public class IntegerDemo {

	public static void main(String[] args) {
		int anInt = 1234;
		byte aByte = 12;
		short aShort = 12345;
		long aLong = 1234567890987654321L;
		int anotherInt = anInt * 10000000; // provides a negative "broken" output.
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Another int is " + anotherInt);
	}

}

// byte		min: -128	max: 127

// short	min: -32,768	max:32,767

// int		min: -2,147,483,648		max: 2,147,483,647

// long		min: -9,223,372,036,854,775,808		max: 9,223,372,036,854,775,807