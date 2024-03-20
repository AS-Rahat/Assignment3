import java.util.*;

public class StringCheak2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String =");

        String string = scanner.next();

        if (string.length() % 2 != 0) {

            String firsthalf = string.substring(0, ((string.length()) - 1) / 2);
            String lasthalf = string.substring((((string.length() - 1) / 2) + 1));

            if (firsthalf.equals(lasthalf))
                System.out.println("First thalf and last half is same.");
            else
                System.out.println("First half and last half is not same.");


        } else {

            String firsthalf = string.substring(0, ((string.length()) / 2));
            String lasthalf = string.substring(((string.length()) / 2));
            if (firsthalf.equals(lasthalf))
                System.out.println("First thalf and last half is same.");
            else
                System.out.println("First half and last half is not same.");


        }
    }


}




