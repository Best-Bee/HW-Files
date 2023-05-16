
public class Ex5_10 {

	public static void main(String[] args) {
		int numLine = 0;
		
		for (int i = 100; i <= 1000; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.print(i);
				numLine++;
				if (numLine == 10) {
					System.out.print("\n");
					numLine = 0;
				} else {
					System.out.print(" ");
				}
			}
		}
		
	}

}
