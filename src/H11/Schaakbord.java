package H11;

import java.awt.*;
import java.applet.*;


public class Schaakbord extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawLine(49, 49,114, 49);
        g.drawLine(49, 106,114, 106);
        g.drawLine(49, 49,49, 106);
        g.drawLine(114, 49,114, 106);
        //eerste rij
        int y = 50;
        int x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);
            }
            x += 8;
        }

        //tweede rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }

        //derde rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }

        //vierde rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }

        //vijfde rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }

        //zesde rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }

        //zevende rij
        x = 50;
        y += 8;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 8, 8);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 8, 8);

            }
            x += 8;
        }
    }
}