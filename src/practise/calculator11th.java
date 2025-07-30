package practise;
import java.util.Scanner;

public class calculator11th {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number:");
		double num1 = sc.nextDouble();
		
		System.out.println("enter second number:");
		double num2 = sc.nextDouble();
		
		System.out.println("addition:" + (num1 +num2) );
		System.out.println("subtraction:" + (num1 - num2 ));
		System.out.println("multiplication:" + (num1 * num2) );
		
		if (num2 !=0) {
			System.out.println("result =" + (num1 / num2));
		} else {
			System.out.println("cannot divide by zero");
		}
			
		}
		

	}


