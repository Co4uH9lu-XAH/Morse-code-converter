import java.util.HashMap;
import java.util.Locale;

public class DecoderMethod {

    public static void decoderMethod(HashMap<String, String> map, String string){
        StringBuilder temp = new StringBuilder();
        String [] array = string.split(" ");
        for (String str: array){
            temp.append(map.get(str.toLowerCase()));
        }
        System.out.println(temp);
    }
}