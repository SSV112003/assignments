package training;
import java.util.Scanner;

public class conditionalstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x");
		int x = sc.nextInt();
		System.out.println("enter value of y");
		int y = sc.nextInt();
		
		if(x>y)
			System.out.println("x is greater ");
		else
			System.out.println("y is greater");
		
		
		/*int x = 10;
		int y = 20;
		if (x>y)
			System.out.println("x is greater than y");
		else 
			System.out.println("y is greater");*/
			

	}

}
