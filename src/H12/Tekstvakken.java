package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tekstvakken extends Applet {
    private TextField[] tekstvakken;
    private int[] getallen;

    public void init() {
        tekstvakken = new TextField[5];
        getallen = new int[5];
        Button knop = new Button("Ok");
        knop.addActionListener(new Listener());
        add(knop);

        for (int i = 0; i < tekstvakken.length; i++) {
            TextField tekstvak = new TextField("", 5);
            tekstvakken[i] = tekstvak;
            add(tekstvak);
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
                String input = tekstvakken[i].getText();
                getallen[i] = Integer.parseInt(input);
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvakken[i].setText(String.valueOf(getallen[i]));
            }

        }
    }
}