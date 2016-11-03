package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Waardes extends Applet {

    private int[] getallen = {0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 8, 9, 9, 9, 10, 10, 10};
    private TextField tekstvak;
    private String string;
    private int teller;

    public void init() {
        teller = 0;
        string = "";
        tekstvak = new TextField("", 5);
        Button knop = new Button("OK");
        knop.addActionListener(new Listener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + string, 100, 50);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int zoeken = Integer.parseInt(tekstvak.getText());
            for (int aGetallen : getallen) {
                if (aGetallen == zoeken) {
                    teller++;
                }
            }
            if (teller > 0) {
                string = "De waarde " + zoeken + " is " + teller + " keer gevonden.";
            } else {
                string = "De waarde is niet gevonden.";
            }
            teller = 0;
            tekstvak.setText("");
            repaint();
        }
    }
}