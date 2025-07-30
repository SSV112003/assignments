package practise2;

interface PerformOperation {
    boolean check(int a);
}

public class QNO28 {

    public static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            String str = Integer.toString(a);
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        };
    }

    public static void main(String[] args) {
        PerformOperation op1 = isOdd();
        PerformOperation op2 = isPrime();
        PerformOperation op3 = isPalindrome();

        int num = 121;

        System.out.println("Is " + num + " odd? " + op1.check(num));
        System.out.println("Is " + num + " prime? " + op2.check(num));
        System.out.println("Is " + num + " palindrome? " + op3.check(num));
    }
}

