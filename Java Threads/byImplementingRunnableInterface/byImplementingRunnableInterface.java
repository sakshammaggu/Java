public class byImplementingRunnableInterface implements Runnable{
    public void run() {
        System.out.println("Thread is running..");
    }
    public static void main(String[] args) {
        byImplementingRunnableInterface obj=new byImplementingRunnableInterface();
        Thread t1=new Thread(obj); // Using the constructor Thread(Runnable r)  
        t1.run();
    }
}