import java.util.*;

public class Numberscheak {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3)
            System.out.print("All are same.");
        else if (number1 != number2 && number1 != number3 && number2 != number3)
            System.out.print("All are diffrent.");
        else if (number1 == number2 || number1 == number3 || number1 != number2 || number1 != number2)
            System.out.print("Two of them are same.");
        else
            System.out.print("Neither.");


    }
}
