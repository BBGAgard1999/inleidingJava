package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TafelTotTien extends Applet {
    private int som;

    public void init() {
        som = 1;
        Button knop = new Button("Volgende tafel");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        int teller, uitkomst;
        int y = 50;

        for (teller = 1; teller <= 10; teller++) {
            uitkomst = teller * som;
            y += 20;
            g.drawString(teller + " x " + som + " = " + uitkomst, 50, y);
        }
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            som += 1;
            if (som > 10)
                som = 1;
            repaint();
        }
    }
}