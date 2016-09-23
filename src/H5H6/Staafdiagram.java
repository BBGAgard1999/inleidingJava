package H5H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by jdecl_000 on 16-9-2016.
 */
public class Staafdiagram extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 40;
        b = 100;
        c = 80;

        uitkomst = a * 2;
        uitkomst2 = b * 2;
        uitkomst3 = c * 2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(50, 350, 50, -uitkomst);
        g.fillRect(120, 350, 50, -uitkomst2);
        g.fillRect(190, 350, 50, -uitkomst3);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 40);
        g.drawString("Jeroen", 120, 40);
        g.drawString("Hans", 190, 40);
        g.drawString(uitkomst + "kg", 50, 50);
        g.drawString(uitkomst2 + "kg", 120, 50);
        g.drawString(uitkomst3 + "kg", 190, 50);
    }

}
