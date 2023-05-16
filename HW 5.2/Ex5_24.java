
public class Ex5_24 {

	public static void main(String[] args) {
		double num1 = 1;
		double num2 = 3;
		double total = 0;
		
		while (num1 <= 97) {
			total += (num1 / num2);
			num1 += 2;
			num2 += 2;
		}
		System.out.print("The total of (1/3) + (3/5) + ... (97/99) is ");
		System.out.printf("%.4f", total);

	}

}
