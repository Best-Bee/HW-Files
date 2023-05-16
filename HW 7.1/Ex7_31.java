import java.util.Scanner;

public class Ex7_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int[] testData1 = new int[input.nextInt()];
		for (int i = 0; i < testData1.length; i++) {
			testData1[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		int[] testData2 = new int[input.nextInt()];
		for (int i = 0; i < testData2.length; i++) {
			testData2[i] = input.nextInt();
		}
		int[] testData3 = merge(testData1, testData2);
		System.out.print("The merged list is ");
		for (int i = 0; i < testData3.length - 1; i++) {
			System.out.print(testData3[i] + " ");
		}
	}
	
	public static int[] merge(int[] list1, int[] list2)  {
		int[] retVal = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; i++) {
			retVal[i] = list1[i];
		}
		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			retVal[j] = list2[i];	
		}
		sort(retVal);
		return retVal;
	}

	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int low = list[i];
			int lowIndex = i;

			for (int j = (i + 1); j < list.length; j++) {
				if (list[j] < low) {
					low = list[j];
					lowIndex = j; 
				}					
			}

			if (lowIndex != i) {
				list[lowIndex] = list[i];
				list[i] = low;
			}
		}
	}
}
