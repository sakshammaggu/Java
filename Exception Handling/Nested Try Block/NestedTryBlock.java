public class NestedTryBlock {
    static void func1() {
        try {
            int a=10/0;
            System.out.println(a);
            try {
                int arr[]=new int[5];
                arr[0]=10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    static void func2() {
        try {
            int a=10;
            System.out.println(a);
            try {
                int arr[]=new int[5];
                arr[6]=10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        func1();
        func2();
    }
}