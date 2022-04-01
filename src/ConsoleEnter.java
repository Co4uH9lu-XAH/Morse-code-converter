
import java.util.Scanner;

public class ConsoleEnter {

    public static StringBuilder consoleEnter (){
        //System.out.println("Военный! Тщательно введи текст для шифрования. В конце сообщения введи \"end\".");
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
