import java.util.Scanner;

public class Ex4_12 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		int num = 16;
		
		//Prompt user for month and year input
		System.out.print("Enter a hex digit: ");
		char hexNum = input.next().charAt(0);
		if (hexNum == '0') {
			num = 0;
		} else if (hexNum == '1') {
			num = 1;
		} else if (hexNum == '2') {
			num = 2;
		} else if (hexNum == '3') {
			num = 3;
		} else if (hexNum == '4') {
			num = 4;
		} else if (hexNum == '5') {
			num = 5;
		} else if (hexNum == '6') {
			num = 6;
		} else if (hexNum == '7') {
			num = 7;
		} else if (hexNum == '8') {
			num = 8;
		} else if (hexNum == '9') {
			num = 9;
		} else if ((hexNum == 'A') || (hexNum == 'a')) {
			num = 10;
		} else if ((hexNum == 'B') || (hexNum == 'b')) {
			num = 11;
		} else if ((hexNum == 'C') || (hexNum == 'c')) {
			num = 12;
		} else if ((hexNum == 'D') || (hexNum == 'd')) {
			num = 13;
		} else if ((hexNum == 'E') || (hexNum == 'e')) {
			num = 14;
		} else if ((hexNum == 'F') || (hexNum == 'f')) {
			num = 15;
		}
		
		
		//Switch statement to print out the required information based on user input
		switch(num) {
			case 0:
				System.out.println("The binary value is 0000");
				break;
			case 1:
				System.out.println("The binary value is 0001");
				break;
			case 2:
				System.out.println("The binary value is 0010");
				break;
			case 3:
				System.out.println("The binary value is 0011");
				break;
			case 4:
				System.out.println("The binary value is 0100");
				break;
			case 5:
				System.out.println("The binary value is 0101");
				break;
			case 6:
				System.out.println("The binary value is 0110");
				break;
			case 7:
				System.out.println("The binary value is 0111");
				break;
			case 8:
				System.out.println("The binary value is 1000");
				break;
			case 9:
				System.out.println("The binary value is 1001");
				break;
			case 10:
				System.out.println("The binary value is 1010");
				break;
			case 11:
				System.out.println("The binary value is 1011");
				break;
			case 12:
				System.out.println("The binary value is 1100");
				break;
			case 13:
				System.out.println("The binary value is 1101");
				break;
			case 14:
				System.out.println("The binary value is 1110");
				break;
			case 15:
				System.out.println("The binary value is 1111");
				break;
			default:
				System.out.println(hexNum + " is an invalid input");
		}
	}

}
