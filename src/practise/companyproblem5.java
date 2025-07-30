package practise;
import java.util.Scanner;

public class companyproblem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		        // Input: Salary
		        System.out.print("Enter your salary: ");
		        double salary = sc.nextDouble();

		        // Input: Years of Service
		        System.out.print("Enter your years of service: ");
		        int years = sc.nextInt();

		        // Bonus Logic
		        if (years > 6) {
		            double bonus = salary * 10 / 100;  // 10% of salary
		            System.out.println("You are eligible for a bonus of: ₹" + bonus);
		        } else {
		            System.out.println("You are not eligible for a bonus.");
		        }

		        sc.close();
		    


	}

}
