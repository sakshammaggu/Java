import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter age: ");
        try {
            int age=myObj.nextInt();
            if (age<18) {
                throw new ArithmeticException("You are not eligible to vote."); // throwing custom arithmetic exception
            } else {
                System.out.println("You are eligible to vote.");
            }
        } finally {
            myObj.close();
        }
    }
}