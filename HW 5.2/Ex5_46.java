import java.util.Scanner;

public class Ex5_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt the user for input
		System.out.print("Enter a string: ");
		String word = input.nextLine();
		System.out.print("The reversed string is ");
		
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}

	}

}
