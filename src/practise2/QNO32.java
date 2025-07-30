package practise2;

public class QNO32 {

	public static void main(String[] args) {

		try {
			int[] arr = new int[-5];
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}

		try {
			int[] arr2 = {1, 2, 3};
			int x = arr2[5];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			String str = "Hi";
			char ch = str.charAt(5);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			java.util.List<String> list = java.util.Arrays.asList("a", "b");
			String s = list.get(5);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			String str = null;
			int len = str.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

