import java.util.Scanner;

public class TypesVariablesBranching {

	private static Scanner input;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		System.out.printf("Hello, %s!\n", firstName);
		
		System.out.println("\nWhere are you from?");
		String hometown = input.nextLine();
		
		System.out.printf("\nSo, you're from %s? I hear it's nice there this time of year.\n", hometown);
		
		
		System.out.println("\nHow old are you?");
		int age = Integer.parseInt(input.nextLine());
		System.out.printf("\nSo, you're name is %s you're from %s, and you're %d-years-old.\n", firstName, hometown, age);
		
		System.out.printf("\nAlright, %s let's do some math.\n", firstName);
		System.out.println("Are you ready?");
		String response = input.nextLine();
		/*if (response == "yes") {
			System.out.printf("%s, Great! Let's get started\n", response);
		} if (response == "no") {
			System.out.printf("%s, oh, I'm sorry to hear that. Next time then.\n", response);
		} else {
			System.out.printf("%s, that is not an answer.\n", response);
		} */
		if (response.equals("yes")){
			System.out.printf("%s, Great! Let's get started\n", response);
			if (response.equals("no")){
			System.out.printf("%s, oh, I'm sorry to hear that. Next time then.\n", response);
			}
		} else {
			System.out.printf("That is not an answer.\n", response);
		}
		
	}
}
