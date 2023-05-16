import java.util.Scanner;

public class Ex7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		int[] studentScores = new int[numStudents];
		
		if (numStudents == 1) {
			System.out.print("Enter " + numStudents + " score: ");
		} else if (numStudents <= 0) {
			System.out.print("Invalid Number");
			System.exit(1);
		} else {
			System.out.print("Enter " + numStudents + " scores: ");
		}
		for (int i = 0; i < numStudents; i++) {
			studentScores[i] = input.nextInt();
		}
		int best = 0;
		for (int i = 0; i < numStudents; i++) {
			if (studentScores[i] > best) {
				best = studentScores[i];
			}
		}
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is " + grade(studentScores[i], best));
		}
		

	}
	
	public static char grade(int grade, int best) {
		if (grade >= (best - 10)) {
			return 'A';
		} else if (grade >= (best - 20)) {
			return 'B';
		} else if (grade >= (best - 30)) {
			return 'C';
		} else if (grade >= (best - 40)) {
			return 'D';
		} else {
			return 'F';
		}
	}

}
