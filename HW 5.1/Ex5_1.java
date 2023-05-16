import java.util.Scanner;

public class Ex5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int numPos = 0;
		int numNeg = 0;
		int data = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			data = input.nextInt();
			num += data;
			
			if (data > 0) {
				numPos++;
			} else if (data < 0) {
				numNeg++;
			}
			
		} while (data != 0);
		
		if (numPos == 0 && numNeg == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
			System.out.println("The number of positives is " + numPos);
			System.out.println("The number of negatives is " + numNeg);
			System.out.println("The total is " + (float)num);
			System.out.println("The average is " + ((float)num) / (numPos + numNeg));
		}
	}

}
