public class byExtendingThreadClass extends Thread {
    public void run(){  
    System.out.println("thread is running...");  
    }
    public static void main(String[] args) {
        byExtendingThreadClass t1=new byExtendingThreadClass();
        t1.run();
    }
}