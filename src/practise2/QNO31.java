package practise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QNO31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            System.out.print("Enter an index to access character: ");
            int index = sc.nextInt();

            char ch = text.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: You must enter a valid integer.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: Invalid index for the given string.");
        }

        sc.close();
    }
}

