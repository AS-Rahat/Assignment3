import java.util.*;

public class digitcheaker {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number =");
        int number = scanner.nextInt();

        int count = 0;
        if (number < 0)
            number = number * -1;

        String X = String.valueOf(number);
        for (int i = 0; i < X.length(); i++) {
            number = number % 10;
            count = count + 1;
        }
        System.out.println("Number of digits =" + count);

    }


}
