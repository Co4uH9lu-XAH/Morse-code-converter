import java.util.Scanner;

public class ConsoleEnter {
    public static String console;

    public static String consoleEnter (){
        Scanner scanner = new Scanner(System.in);
        return console = scanner.nextLine();
    }
}
