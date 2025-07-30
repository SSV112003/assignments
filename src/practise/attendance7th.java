package practise;
import java.util.Scanner;

public class attendance7th {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Input: Classes held
	        System.out.print("Enter number of classes held: ");
	        int totalClasses = sc.nextInt();

	        // Input: Classes attended
	        System.out.print("Enter number of classes attended: ");
	        int attendedClasses = sc.nextInt();

	        // Calculate attendance percentage
	        double percentage = (attendedClasses * 100.0) / totalClasses;

	        // Output percentage
	        System.out.println("Attendance percentage: " + percentage + "%");

	        // Check if eligible to sit in exam
	        if (percentage >= 70) {
	            System.out.println("You are allowed to sit in the exam.");
	        } else {
	            System.out.println("You are NOT allowed to sit in the exam.");
	        }

	        sc.close();

	}

}
