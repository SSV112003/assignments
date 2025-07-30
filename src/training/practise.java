package training;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number (1 to 7):");
		int n = sc.nextInt();
		
		switch(n) {
		
			case 1:
				System.out.println("It is Monday");
				break;
			case 2:
				System.out.println("It is Tuesday");
				break;
			case 3:
				System.out.println("It is Wednesday");
				break;
			case 4:
				System.out.println("It is Thursday");
				break;
			case 5:
				System.out.println("It is Friday");
				break;
			case 6:
				System.out.println("It is Saturday");
				break;
			case 7:
				System.out.println("It is Sunday");
				break;
			default:
				System.out.println("Invalid input. Please enter a number from 1 to 7.");
			sc.close();
		
		}

	}

}
