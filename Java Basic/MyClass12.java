import java.util.Scanner;

public class MyClass12{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int a = myScanner.nextInt();

		System.out.print("Enter second number :");
		int b = myScanner.nextInt();

		int total = a + b;

		System.out.println("Total is "+ total);
	}
}