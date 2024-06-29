public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Null Pointer Exception Handled.");
        }
    }
}