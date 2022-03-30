public class Main {
    public static void main(String[] args) {
        String cons = ConsoleEnter.consoleEnter();
        System.out.println(Morse.morseConvert(cons));
    }
}
