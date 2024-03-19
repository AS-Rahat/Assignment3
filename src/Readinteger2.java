import java.util.*;

public class Readinteger2 {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value =");
        double value = scanner.nextDouble();

        if (value > 1) {
            if (value > 1000000)
                System.out.println("Positive and Large");
            else
                System.out.println("Positive");
        } else if (value < 1) {
            if (value > 0)
                System.out.println("positive and small");
            else if (value==0)
                System.out.println("Zero");
            else
                System.out.println("Negative");
        }

    }
}
