import java.util.Scanner;

public class Ex4_21 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for month and year input
		System.out.print("Enter a SSN: ");
		String SSNumber = input.nextLine();
		SSNumber.trim();
		
		if ((SSNumber.charAt(3) == '-') && (SSNumber.charAt(6) == '-'))  {
			System.out.println(SSNumber + " is a valid social security number");
		} else {
			System.out.println(SSNumber + " is not a valid social security number");
		}
	}

}
