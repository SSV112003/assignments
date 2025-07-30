package practise2;

public class QNO42 {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown from someMethod2");
    }
}

