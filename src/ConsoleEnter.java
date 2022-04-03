
import java.util.Scanner;

public class ConsoleEnter {

    public static StringBuilder consoleEnter (){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String string;
        while(scanner.hasNext()){
            string = scanner.nextLine();
            if (string.equalsIgnoreCase("end")){
                break;
            } else{
                stringBuilder.append(string);
            }
        }
        return stringBuilder;
    }
}
