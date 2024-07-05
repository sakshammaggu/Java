public class Final {    
    final int num=10;
    void display() {
        /*
            gives compile time error
        */
        // num=5;  
    } 
    public static void main(String[] args) {
        Final obj=new Final();
        obj.display();
    }
}