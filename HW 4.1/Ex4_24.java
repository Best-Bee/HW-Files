import java.util.Scanner;

public class Ex4_24 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		String first = "nul";
		String second = "nul";
		String last = "nul";
								
		//Prompt user for month and year input
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if ((city1.compareToIgnoreCase(city2) <= 0 ) && (city1.compareToIgnoreCase(city3) <= 0 )) {
			first = city1;
			if (city2.compareToIgnoreCase(city3) < 0 ) {
				second = city2;
				last = city3;
			} else {
				second = city3;
				last = city2;
			}
		} else if ((city2.compareToIgnoreCase(city1) < 0 ) && (city2.compareToIgnoreCase(city1) < 0 )) {
			first = city2;
			if (city1.compareToIgnoreCase(city3) < 0 ) {
				second = city1;
				last = city3;
			} else {
				second = city3;
				last = city1;
			}
		} else if ((city3.compareToIgnoreCase(city1) < 0 ) && (city3.compareToIgnoreCase(city2) < 0 )) {
			first = city3;
			if (city1.compareToIgnoreCase(city2) < 0 ) {
				second = city1;
				last = city2;
			} else {
				second = city2;
				last = city1;
			}
		}
		System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + last);
	}

}
