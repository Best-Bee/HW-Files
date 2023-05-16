
public class Ex5_13 {

	public static void main(String[] args) {
		int n = 0;
		int nextN = 1;
		
		while ((nextN * nextN * nextN) < 12000) {
			n++;
			nextN++;
		}
		
		System.out.print("The largest number 'n' so that n^3 is less than 12000 is: " + n);

	}

}
