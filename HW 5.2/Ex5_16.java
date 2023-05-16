import java.util.Scanner;

public class Ex5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt the user for input
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		int tester = 2;

		while (num / tester != 1){
			if (num % tester  == 0){
				System.out.print(tester + ", ");
				num = num / tester; 
			} else {
				tester++;	
			}
		}
		System.out.println(num + ".");

	}

}
