
public class Ex6_30 {

	public static void main(String[] args) {
		int result = result(roll2());
		
		if (result == 0 || result == 1) {
			if (result == 0) {
				System.out.println("You lose");
			} else {
				System.out.println("You win");
			}
		} else {
			finishGame(result);
		}

	}
	
	public static int roll2() {
		int d1 = (int)(1 + Math.random() * 6);
		int d2 = (int)(1 + Math.random() * 6);
		int sum = d1 + d2;
		System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum);
		return sum;
	}
	
	public static int result(int p) {
		switch(p) {
			case 2  :
				p = 0;
				break;
			case 3  :
				p = 0;
				break;
			case 12 :
				p = 0;
				break;
			case 7  :
				p = 0;
				break;
			case 11 :
				p = 1;
				break;
		}
		return p;
	}
	
	public static void finishGame(int p) {
		System.out.println("Point is " + p);
		int result = roll2();
		while (result != p && result != 7) {
			result = roll2();
		}
		if (result == 7) {
			System.out.println("You lose");
		} else {
			System.out.println("You win");
		}
	}

}
