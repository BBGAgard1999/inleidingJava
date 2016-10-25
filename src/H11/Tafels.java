package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tafels extends Applet {
    private TextField tekstvak;
    private int som;

    public void init() {
        Label label = new Label("Voer een getal in");
        Button knop = new Button("Ok");
        knop.addActionListener( new KnopListener());
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new KnopListener ());
        add (label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller, uitkomst;
        int y = 50;

        for(teller = 1; teller <= 10; teller++) {
            uitkomst = teller * som;
            y += 20;
            g.drawString(teller + " x " + som + " = " + uitkomst, 50, y );
        }
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String t = tekstvak.getText();
            som = Integer.parseInt(t);
            repaint();

        }
    }
}

