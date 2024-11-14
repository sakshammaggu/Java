public class genericMethod {
    static <T> void genericMethodDisplay(T element) {
        System.out.println(element.getClass().getName()+"="+element);
    }
    public static void main(String[] args) {
        genericMethodDisplay(10);
        genericMethodDisplay("Hi");
    }
}