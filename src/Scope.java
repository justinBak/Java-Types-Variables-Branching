import java.util.Scanner;
public class Scope {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "Justin";
		int num = 10;
		
		{
			//int maxNum;
			//System.out.print(maxNum);
			int numTwo = 5;
			System.out.println(name);
			System.out.println(numTwo);
		}
		{
			if (num == 10) 
			{
				System.out.println("Correct number.");
			}
		}
	}
}