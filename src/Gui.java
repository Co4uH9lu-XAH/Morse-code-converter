import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    JLabel enterLabel;
    JTextArea textAreaInput;
    JLabel encoderLabel;
    JLabel decoder;
    JRadioButton enButton;
    JRadioButton decButton;
    JButton doButton;
    JButton clear;
    JLabel outputLabel;
    JTextArea textAreaOutPut;

    public Gui(String label){

        JFrame frame = new JFrame("Enigma-2022");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        enterLabel = new JLabel("Ввод");
        c.gridx=0;
        c.gridy =0;
        c.gridwidth = 1;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.9;
        c.insets = new Insets(10,10,0,0);
        c.ipadx = 0;
        c.ipady = 0;
        frame.add(enterLabel, c);

        textAreaInput = new JTextArea(3,40);
        c.gridx=1;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.insets = new Insets(10,10,0,10);
        textAreaInput.setLineWrap(true);
        frame.add(new JScrollPane(textAreaInput), c);

        encoderLabel = new JLabel("Шифр");
        c.gridx=1;
        c.gridy=4;
        c.gridwidth = 1;
        c.gridheight = 1;
        frame.add(encoderLabel, c);

        decoder = new JLabel("Дешифр");
        c.gridx=2;
        c.gridy=4;
        frame.add(decoder, c);

        enButton = new JRadioButton();
        c.gridx=1;
        c.gridy=5;
        frame.add(enButton, c);

        decButton = new JRadioButton();
        c.gridx=2;
        c.gridy=5;
        frame.add(decButton, c);

        ButtonGroup group = new ButtonGroup();
        group.add(enButton);
        group.add(decButton);

        doButton = new JButton("Шифр/дешифр");
        c.gridx=4;
        c.gridy=5;
        frame.add(doButton, c);

        clear = new JButton("Очистить");
        c.gridx=5;
        c.gridy=5;
        clear.addActionListener(new ClearButton());
        frame.add(clear, c);

        outputLabel = new JLabel("Вывод");
        c.gridx=0;
        c.gridy =6;
        c.gridwidth = 1;
        c.gridheight = 3;
        c.insets = new Insets(10,10,0,0);
        frame.add(outputLabel, c);

        textAreaOutPut = new JTextArea(3,40);
        c.gridx=1;
        c.gridwidth = 6;
        c.gridheight = 3;
        c.insets = new Insets(10,10,10,10);
        textAreaOutPut.setLineWrap(true);
        frame.add(new JScrollPane(textAreaOutPut), c);

        frame.pack();
        frame.setVisible(true);
    }
    class ClearButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textAreaInput.setText("");
        }
    }

}
