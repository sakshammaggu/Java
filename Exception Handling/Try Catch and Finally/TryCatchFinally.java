public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Arithmetic Error Handled.");
        }
    }
}