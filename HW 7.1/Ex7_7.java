
public class Ex7_7 {
	public static void main(String[] args) {
		final int LENGTH = 100;
		int[] counts = {0,0,0,0,0,0,0,0,0,0};
		int num = 0;
		for (int i = 0; i < LENGTH; i++) {
			num = (int) (Math.random() * 10);
			counts[num]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("The count for " + i + " is " + counts[i]);
		}
	}
}
