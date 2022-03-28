import java.util.Scanner;
public class Multiply {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nI can add, multiple, subtract, or mode your number. Give me two numbers");
		int userInput1 = Integer.parseInt(input.nextLine());
		int userInput2 = Integer.parseInt(input.nextLine());
		int add = userInput1 + userInput2;
		System.out.println(add);
		int multiply = userInput1 * userInput2;
		System.out.println(multiply);
		int subtraction = userInput1 - userInput2;
		System.out.println(subtraction);
		int mode = userInput1 % userInput2;
		System.out.println(mode);
		
		//illegal fields
		//string fullName = input.nextLine();
		//System.out.printf("Hello, %s", fullName);
		
		
	}
}
