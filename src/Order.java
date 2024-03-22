import java.util.*;

public class Order {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = scanner.nextInt();
        System.out.print("Enter num3 = ");
        int num3 = scanner.nextInt();

        if(num1<num2 && num2<num3) {
            System.out.println("In order.");
        }
        else if (num1>num2 && num2>num3) {
            System.out.println("In order.");
        }
        else if (num1>num2 && num2 == num3){
            System.out.println("In order.");
        }
        else if (num1<num2 && num2==num3){
            System.out.println("In order.");
        }
        else if (num1 == num2 && num2>num3){
            System.out.println("In order.");
        }
        else if(num1==num2 && num2<num3){
            System.out.println("In order.");
        }
        else
            System.out.println("Not in order.");



    }
}
