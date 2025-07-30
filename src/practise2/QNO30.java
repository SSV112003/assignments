package practise2;

import java.util.Scanner;

@FunctionalInterface
interface MinimumThree {
    float min(float a, float b, float c);
}

public class QNO30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first float: ");
        float a = sc.nextFloat();

        System.out.print("Enter second float: ");
        float b = sc.nextFloat();

        System.out.print("Enter third float: ");
        float c = sc.nextFloat();

        MinimumThree min3 = QNO30::minimum3;

        float result = min3.min(a, b, c);

        System.out.println("Minimum of the three: " + result);

        sc.close();
    }

    public static float minimum3(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }
}

