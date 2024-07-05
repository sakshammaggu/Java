public class Finalize {
    protected void finalize(){
        System.out.println("Called the finalize() method");   
    }
    public static void main(String[] args) {
        Finalize obj=new Finalize();
        System.out.println(obj.hashCode());
        obj=null;
        System.gc();
        System.out.println("End of the garbage collection.");
    }
}