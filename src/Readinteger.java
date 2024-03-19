import java.util.*;
public class Readinteger {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value=");
        int value = scanner.nextInt();

        if(value>1)
            System.out.println("Positive.");
        else if(value<1)
            System.out.println("Negative.");
        else
            System.out.println("Zero");

    }
}
