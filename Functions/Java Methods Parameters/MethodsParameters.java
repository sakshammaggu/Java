import java.util.Scanner;
public class MethodsParameters {
    static int sum(int a, int b){
        int result=a+b;
        return result;
    }
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter two no.'s: ");
        int a=myObj.nextInt();
        int b=myObj.nextInt();

        int ans=sum(a, b);
        System.out.println("Sum: "+ans);

        myObj.close();
    }
}