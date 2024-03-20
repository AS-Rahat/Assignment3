import java.util.*;

public class squence {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number =");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number =");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number =");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3)
            System.out.print("Increasin Order.");
        else if (num1 > num2 && num2 > num3)
            System.out.print("Decreasin Order.");
        else
            System.out.print("N0 Squence.");


    }
}
