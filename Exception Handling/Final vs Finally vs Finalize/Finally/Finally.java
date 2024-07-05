public class Finally {
    public static void main(String[] args) {
        int num=0;
        try {
            num=10;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(num);
        }
    }
}