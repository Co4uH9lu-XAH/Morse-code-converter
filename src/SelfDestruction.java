import java.util.Scanner;

public class SelfDestruction {

    public static void selfDestruction() throws InterruptedException {

        System.out.println("Военный! Выбери способ самоуничтожения:");
        System.out.println("Для активации встроенного взрывного устройства нажмите 1.");
        System.out.println("Для утраты военно-морским способом нажмите 2.");
        System.out.println("Для уничтожения с помощью ВСК нажмите 3.");
        System.out.println("Для для получения Звезды Героя нажмите 4.");
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
            if(change==1){
                System.out.println("Запущен обратный отсчет тактического ядрного заряда.");
                System.out.println("Встаньте спиной с эпицентру взрыва, так, чтобы сталь со штык-ножа");
                System.out.println("не капала на казеные сапоги.");
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("Бабах!");
            } else if(change==2){
                System.out.println("Положите прибор в каптерку. И отвернитесь.");
                System.out.println("Убедитесь, что, по крайней мере, три прапорщика это заметили.");
            } else if(change==3){
                System.out.println("Координаты прибора переданы на Звезду Смерти.");
                System.out.println("Немедленно покиньте планету!");
            } else if (change==4){
                System.out.println("Представление на звание Героя РФ (посмертно) заполнено и отправлено в штаб.");
                System.out.println("Координаты для нанесения удара переданы в Объедененный Штаб");
                System.out.println("Ядерных Сил РФ.");
                System.out.println("Родина Вас не забудет, товарищ военный. Прощайте.");
            }
    }
}
