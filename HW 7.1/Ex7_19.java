
public class Ex7_19 {

	public static void main(String[] args) {
		int[] testData1 = {1,2,3,4,5,6,7,8,9,10};
		int[] testData2 = {7,4,9,2,6,9,3,5,8,2,2};
		
		if (isSorted(testData1)) {
			System.out.println("Test Data 1 is sorted");
		} else {
			System.out.println("Test Data 1 is not sorted");
		}
		
		if (isSorted(testData2)) {
			System.out.println("Test Data 2 is sorted");
		} else {
			System.out.println("Test Data 2 is not sorted");
		}
		
	}

	public static boolean isSorted(int[] list) {
		int lowest = list[0];
		for (int i = 0; i < list.length - 1; i++) {
			if (lowest > list[i]) {
				return false;
			}
		}
		return true;
	}
}
