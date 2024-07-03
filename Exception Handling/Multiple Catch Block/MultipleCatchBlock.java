public class MultipleCatchBlock {
    static void func1() {
        try {
            int a[]=new int[5];
            a[6]=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    static void func2() {
        try {
            int a[]=new int[5];
            a[6]=10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
    }
    public static void main(String[] args) {
        func1();
        func2();
    }
}