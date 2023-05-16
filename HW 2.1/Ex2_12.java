import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for input
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		//Calculate the runway distance required
		double reqDist = (speed * speed) / (2 * acceleration);
		

		System.out.println("The minimum runway length for this airplane is: " + reqDist);
			
	}

}
