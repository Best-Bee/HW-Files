import java.util.Scanner;

/*--------------------------------------------------------------------------------
/ 
/ Author: Brendan Best
/ Program: Check if a point is inside a circle
/ Date: 10/20/2021
/
/-------------------------------------------------------------------------------*/

public class Ex3_22 {
	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for two points
		System.out.print("Enter a point with two coordinates: \n");
		double point1 = input.nextDouble();
		double point2 = input.nextDouble();
		
		//gets the distance from the point to the center of the circle
		double distance = Math.sqrt((Math.pow(point1,2) + (Math.pow(point2,2))));
		
		//if it's within the circle, say it is, otherwise it's not
		if (distance <= 10) {
			System.out.println("Point (" + point1 + ", " + point2 + ") is in the circle ");
		} else {
			System.out.println("Point (" + point1 + ", " + point2 + ") is not in the circle ");
		}
	}
}
