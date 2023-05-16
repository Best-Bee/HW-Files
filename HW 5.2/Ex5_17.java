import java.util.Scanner;

public class Ex5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt the user for input
		System.out.print("Enter the number of lines: ");
		int num = input.nextInt();
		
		for(int i = 0; i <= num; i++) {
			//System.out.print("\t\t\t");
			
			//makes the spaces
			for (int j = num - i; j >= 1; j--) {
				System.out.print("   ");
			}
			
			//makes the numbers til 1 (1 included)
			for (int k = i; k >= 2; k--) {
				System.out.printf("%3d",k);
			}
			
			//makes numbers after 1 in pyramid
			for (int l = 1; l <= i; l++) {
				System.out.printf("%3d",l);
			}
			
			//after one loop it goes             1
			
			//then                           2   1   2
			
			//and so on
			
			System.out.print("\n");
		}

	}

}
