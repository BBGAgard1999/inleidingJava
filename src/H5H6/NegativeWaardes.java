package H5H6;

import java.applet.Applet;
import java.awt.*;

public class NegativeWaardes extends Applet{
    double a, b, c, uitkomst;


    public void init() {
        a = 8;
        b = 8;

        c = a + b;

        uitkomst = -c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
