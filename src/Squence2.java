import java.util.*;

public class Squence2 {
    public static void main(String arg[]) {

        java.lang.String a="strict";
        java.lang.String b="lenient";

        System.out.print("What form of increasin or decreasin you want :");
        Scanner scanner = new Scanner(System.in);
        String form1 = scanner.next();

        System.out.print("Enter first number =");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number =");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number =");
        int num3 = scanner.nextInt();




        if (a.equals(form1)) {
            if (num1 < num2 && num2 < num3)
                System.out.print("Increasin Order.");
            else if (num1 > num2 && num2 > num3)
                System.out.print("Decreasin Order.");
            else
                System.out.print("N0 Squence.");
        } else if (b.equals(form1)) {
            if (num1 < num2 && num2 == num3)
                System.out.print("Increasin Order.");
            else if (num1 == num2 && num2 == num3)
                System.out.print("Increasin Order.");
            else if (num1 < num2 && num2 < num3)
                System.out.print("Increasin Order.");
            else if (num1 > num2 && num2 > num3)
                System.out.print("Decreasin Order.");
            else
                System.out.print("N0 Squence.");


        }


    }
}
