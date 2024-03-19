import java.util.*;

public class StringCheak {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String =");
        String name = scanner.next();

        String firstthree = name.substring(0, 1);
        String lastthree = name.substring(name.length() - 1);

        if (firstthree.equals(lastthree))
            System.out.println("First letter and last letter same.");
        else
            System.out.println("First letter and last letter not same.");


    }
}
