public class BlockScope {
    public static void main(String[] args) {
        // this is a block
        {
            // variable inside block can be used inside block only
            int x=10;
            System.out.println(x);
        }
    }
}