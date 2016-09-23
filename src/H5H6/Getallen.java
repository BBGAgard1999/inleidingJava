package H5H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by jdecl_000 on 15-9-2016.
 */
public class Getallen extends Applet{
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 7;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }


}
