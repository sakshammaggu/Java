class vehicle {
    protected String brand="abc";
    protected void printBrandName() {
        System.out.println("Brand: " + brand);
    }
}
class car extends vehicle {
    protected String model="def";
    protected void printModelName() {
        car carObj=new car();
        carObj.printBrandName();
        System.out.println("Model: " + model);
    }
}
public class inheritance extends car {
    public static void main(String[] args) {
        inheritance obj=new inheritance();
        obj.printModelName();
    }
}