package H5H6;

import java.applet.Applet;
import java.awt.*;

public class GeldVerdeling extends Applet{
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 35);
        g.drawString("Jeannette: " + uitkomst, 20, 50);
        g.drawString("Jarod: " + uitkomst, 20, 65);
    }


}
