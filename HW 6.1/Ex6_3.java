
public class Ex6_3 {

	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = 12321;
		
		System.out.println("" + reverse(num1));
		System.out.println("" + reverse(num2));
		
		System.out.println("" + isPalindrome(num1));
		System.out.println("" + isPalindrome(num2));

	}
	
	public static int reverse(int number) {
		int retVal = 0;
		int num = number;
		int tempNum = 0;
		while (num > 10) {
			tempNum = num % 10;
			retVal += tempNum;
			retVal *= 10;
			num /= 10;
		}
		tempNum = num % 10;
		retVal += tempNum;
		return retVal;
	}
	
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}
		
	}
}
