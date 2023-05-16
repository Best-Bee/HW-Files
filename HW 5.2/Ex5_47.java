import java.util.Scanner;

public class Ex5_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int middleNum = 0;
		int num = 0;

		//prompt the user for input
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.nextLine();
		
		if (isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input");
			
		} else {
			for (int i = 0; i < isbn.length(); i++) {
				if (i % 2 == 0) {
					middleNum += (isbn.charAt(i) - '0');
				} else {
					middleNum += (isbn.charAt(i) - '0') * 3;
				}
			}
		
		
			num = 10 - ((middleNum) % 10);
		
			if (num == 10) {
				num = 0;
			}
			System.out.println("The ISBN-13 number is " + isbn + "" + num);
		}
	}

}
