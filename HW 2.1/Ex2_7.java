import java.util.Scanner;
public class Ex2_7 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		//Calculate years and remaining days
		int days = (minutes / 60) / 24;
		int years = days / 365;
		int remDays = days % 365;

		System.out.println(minutes + " minutes is approximately " + years + 
				" years and " + remDays + " days.");
	}

}
