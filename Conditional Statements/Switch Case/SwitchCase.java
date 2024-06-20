import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=myObj.nextInt();
        switch (num) {
            case 1:
                System.out.println("Value is " + 1);
                break;
            case 2:
                System.out.println("Value is " + 2);
                break;
            default:
                System.out.println("Value is " + num);
                break;
        }
        myObj.close();
    }
}