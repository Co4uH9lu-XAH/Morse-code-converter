import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            Gui gui = new Gui("Enigma-2022");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Что-то не вышло. Возможно, шпион открутил контрогайку.", "Аларм.",0);
        }
    }
}

