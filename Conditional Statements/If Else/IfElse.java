import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=myObj.nextInt();
        if (num>5){
            System.out.println(num + " is greater than 5");
        }
        else if (num<5){
            System.out.println(num + " is less than 5");
        }
        else{
            System.out.println(num + " is equal to 5");
        }
        myObj.close();
    }
}