
public class Ex5_5 {

	public static void main(String[] args) {
		int k = 1, p = 20;
		double POUND_PER_KILO = 2.2;
		double KILO_PER_POUND = 0.45359237;
		
		System.out.printf("%-10s%10s%5s%4s%-10s%10s", "Kilograms", "Pounds", "|", " ", "Pounds", "Kilograms");
		while (k <= 199) {
			System.out.print("\n");
			System.out.printf("%-10d%10.1f%5s%4s%-10d%10.2f", k, (k * POUND_PER_KILO), "|", " ", p, (p * KILO_PER_POUND));
			k += 2;
			p += 5;
		}

	}

}
