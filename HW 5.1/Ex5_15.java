
public class Ex5_15 {

	public static void main(String[] args) {
		int lineCount = 0;
		for (int i = 33; i < 127; i++) {
			System.out.print((char) i);
			lineCount++;
			if (lineCount == 10) {
				System.out.print("\n");
				lineCount = 0;
			} else {
				System.out.print(" ");
			}
		}
		int letter = (int) ((Math.random() * 26) + 97);
		System.out.println((char)letter);
	}

}
