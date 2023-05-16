import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
						
		//Prompt user for month and year input
		System.out.print("Enter string s1: ");
		String string1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String string2 = input.nextLine();
				
		if (string1.contains(string2))  {
			System.out.println(string2 + " is a substring of " + string1);
		} else {
			System.out.println(string2 + " is not a substring of " + string1);
		}

	}

}
