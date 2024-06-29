public class ArrayIndexOutOfBoundsExceptionHandling {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[10]=50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Array Index Out Of Bounds Exception Handled.");
        }
    }
}