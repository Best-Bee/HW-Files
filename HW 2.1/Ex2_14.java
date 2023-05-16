import java.util.Scanner;

public class Ex2_14 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for input
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		//change weight and height to kg and meters
		weight *= .45359237;
		height *= .0254;
		
		//Calculate the user's BMI
		
		double bmi = weight / (height * height);

		System.out.println("BMI is: " + bmi);
			
	}

}
