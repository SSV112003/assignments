package practise;
import java.util.Scanner;

public class sellingproduct9th {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double totalValue = 0.0;
        char choice = 0;

        do {
           
            System.out.print("Enter product number (1-3): ");
            int productNumber = sc.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue; 
            }

            double productTotal = price * quantity;
            totalValue += productTotal;

            System.out.println("Product total: ₹" + productTotal);

            System.out.print("Do you want to enter another product? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Total retail value of all products sold: ₹" + totalValue);
        sc.close();
		

	}

}
