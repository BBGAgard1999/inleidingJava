package H11;

import java.awt.*;
import java.applet.*;


public class Fibonacci extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int getal1 = 1, getal2 = 0;
        int uitkomst;
        int x = 0;

        for(int teller = 0; teller < 12; teller++) {
            x += 20;
            g.drawString("" + (getal1 + getal2), x, 15 );
            uitkomst = getal1;
            getal1 = getal2;
            getal2 = uitkomst + getal2;

        }
    }
}