package H5H6;

import java.applet.Applet;
import java.awt.*;


public class Gemiddelde extends Applet {
    private double uitkomst;

    public void init() {
        double a = 5.9;
        double b = 6.3;
        double c = 6.9;
        double berekening = (a + b + c) / 3;
        int i = (int) (berekening * 10);
        uitkomst= (double) i / 10;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
    }
}