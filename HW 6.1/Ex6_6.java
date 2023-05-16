import java.util.Scanner;
public class Ex6_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		displayPattern(num);
	}

	public static void displayPattern(int n) {
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = i; k > 0; k--) {
				System.out.printf("%2d", k);
			}
			System.out.print("\n");
			space--;
		}
	}
}
