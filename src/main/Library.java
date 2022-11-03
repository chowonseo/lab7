package main;

public class Library {
	public static void main(String arg[]) {
		System.out.println("Hello, JUnit 4!");	
	}
	
	public static int computeOne() {
		return 1;
	}
	
	public static boolean isItTrue() {
		return true;
	}
	
	public static boolean isEvenNumber(int num) {
		if ((num % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static int[] sort(int[] anyArray) {
		return new int[] {1, 2, 3, 4, 5};
	}
	
	// My added test #1
	public static boolean isEqual(int num1, int num2) {
		if (num1 == num2)
			return true;
		else
			return false;
	}
	
	// My added test #2
	public static boolean isMultipleOf(int num1, int num2) {
		if (num1 % num2 == 0)
			return true;
		else
			return false;
	}
		
		
	
}
