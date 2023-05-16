
public class Ex6_27 {

	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 0;
		int i = 10;
		while (count1 < 100) {
			if (isEmirp(i)) {
				System.out.print(i + " ");
				count1++;
				count2++;
			}
			i++;
			if (count2 == 10) {
				System.out.println();
				count2 = 0;
			}
		}
	}
	
	public static int reverse(int number) {
		int retVal = 0;
		int num = number;
		while (num >= 10) {
			retVal += num % 10;
			retVal *= 10;
			num /= 10;
		}
		retVal += num % 10;
		return retVal;
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEmirp(int num) {
		if (reverse(num) == num) {
			return false;
		}
		if (isPrime(num) && isPrime(reverse(num))) {
			return true;
		}
		return false;
	}
}
