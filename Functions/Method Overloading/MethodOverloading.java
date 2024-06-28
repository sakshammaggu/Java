import java.util.Scanner;
public class MethodOverloading {
    static int sum(int a, int b){
        return a+b;
    }
    static double sum(double c, double d){
        return c+d;
    }
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter no.'s: ");

        int a=myObj.nextInt();
        int b=myObj.nextInt();
        double c=myObj.nextDouble();
        double d=myObj.nextDouble();

        int intSum=sum(a, b);
        double doubleSum=sum(c, d);
        System.out.println("intSum: " + intSum);
        System.out.println("doubleSum: " + doubleSum);
        myObj.close();
    }
}