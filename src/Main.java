import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Военный! Выбери режим работы ПБШ2022:");
        System.out.println("Для выбора режима шифрования нажми 1.");
        System.out.println("Для выбора режима дешифрования нажми 2.");
        System.out.println("В случае угрозы захвата ПБШ2022 противником нажми 3.");
        Scanner scan = new Scanner(System.in);
        int change = scan.nextInt();
            if(change==1){
                System.out.println("Военный! Тщательно введи текст для шифрования. В конце сообщения введи \"end\".");
                Encoder.encoder();
            } else if(change == 2){
                System.out.println("Военный! Убедись в отсутствии шпионов противника и введи шифрограмму.");
                System.out.println("В конеце шифрограммы введи \"end\".");
                Decoder.decoder();
            } else if (change == 3){
                try {
                    SelfDestruction.selfDestruction();
                } catch (InterruptedException e) {
                    System.out.println("Отказ тактического ядерного заряда. Пшииииик. ");
                }
            }
       // Encoder.encoder();
    }
}
