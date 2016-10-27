package H11;

import java.awt.*;
import java.applet.*;

public class Schaakbord extends Applet {

    public void paint(Graphics g) {

        g.drawLine(49, 49,114, 49);
        g.drawLine(49, 106,114, 106);
        g.drawLine(49, 49,49, 106);
        g.drawLine(114, 49,114, 106);

        int y = 42;
        for (int rij = 0; rij < 7; rij++) {
            y += 8;
            int x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 8, 8);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 8, 8);
                    }
                }
                else {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 8, 8);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 8, 8);
                    }
                }
                x += 8;
            }
        }
    }
}