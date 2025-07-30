package practise;
import java.util.Scanner;
public class modification7th {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of classes held: ");
	        int totalClasses = sc.nextInt();

	       
	        System.out.print("Enter number of classes attended: ");
	        int attendedClasses = sc.nextInt();

	        double percentage = (attendedClasses * 100.0) / totalClasses;
	        System.out.println("Attendance percentage: " + percentage + "%");

	        if (percentage < 70) {
	            System.out.print("Do you have a medical cause? (Y/N): ");
	            char medical = sc.next().charAt(0);

	            if (medical == 'Y' || medical == 'y') {
	                System.out.println("You are allowed to sit in the exam due to medical cause.");
	            } else {
	                System.out.println("You are NOT allowed to sit in the exam.");
	            }
	        } else {
	            System.out.println("You are allowed to sit in the exam.");
	        }

	        sc.close();

	}

}
