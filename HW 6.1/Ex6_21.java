import java.util.Scanner;
public class Ex6_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userData = input.nextLine();
		for (int i = 0; i < userData.length(); i++) {
			// use the function for characters to see if it is a letter or not, if it is
			// get the number of the character's upper case and print it, otherwise print
			// the string value (doesn't need to be converted)
			if (Character.isLetter(userData.charAt(i))) {
				System.out.print(getNumber(Character.toUpperCase(userData.charAt(i))));
			} else {
				System.out.print(userData.charAt(i));
			}
		}

	}
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter >= 'W') {
			return 9;
		} else if (uppercaseLetter >= 'T') {
			return 8;
		} else if (uppercaseLetter >= 'P') {
			return 7;
		} else if (uppercaseLetter >= 'M') {
			return 6;
		} else if (uppercaseLetter >= 'J') {
			return 5;
		} else if (uppercaseLetter >= 'G') {
			return 4;
		} else if (uppercaseLetter >= 'D') {
			return 3;
		} else {
			return 2;
		}
	}

}
