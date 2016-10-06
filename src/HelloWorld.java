
import java.util.Scanner;

/**
 * @author Pawel
 */
public class HelloWorld {

    public static void main(String[] args) {
        String input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        input = scanner.nextLine();

        if (!input.isEmpty()) {
            System.out.println("Hello " + input + "!");
        }
        else {
            System.out.println("Hello World!");
        }

        scanner.close();

    }

}
