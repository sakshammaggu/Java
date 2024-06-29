public class ClassNotFoundExceptionHandling {
    public static void main(String[] args) {
        try {
            Class.forName("myClass");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Class Not Found Exception Handled.");
        }
    }
}