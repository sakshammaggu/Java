public class byThreadClassStringName extends Thread {
    public static void main(String[] args) {
        Thread t1=new Thread("My Thread");
        t1.start();
        String str=t1.getName();
        System.out.println(str);
    }
}