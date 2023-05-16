import java.util.Scanner;

public class Ex7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int[] distinctNumbers = eliminateDuplicates(numbers);
		System.out.print("The distinct numbers are:");
		for (int l: distinctNumbers) {
			if (l > 0)
				System.out.print(" " + l);
		}
		System.out.println();
	}
	public static int[] eliminateDuplicates(int[] list) {
		int[] retList = new int[list.length];
		int i = 0;
		for (int j: list) {
			if (linearSearch(retList, j) == -1) {
				retList[i] = j;
				i++;
			}
		}
		return retList;
	}
	public static int linearSearch(int[] array, int key) {
		for (int k = 0; k < array.length; k++) {
			if (key == array[k])
				return k;
		}
		return -1;
	}
}