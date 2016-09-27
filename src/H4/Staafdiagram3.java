package H4;

import java.applet.*;
import java.awt.*;

/**
 * Created by jdecl_000 on 16-9-2016.
 */
public class Staafdiagram3 extends Applet {
    int a;
    int b;
    int c;

    public void init() {
        a = 40;
        b = 100;
        c = 80;

    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(50, 350, 50, -a);
        g.setColor(Color.yellow);
        g.fillRect(120, 350, 50, -b);
        g.setColor(Color.blue);
        g.fillRect(190, 350, 50, -c);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 40);
        g.drawString("Jeroen", 120, 40);
        g.drawString("Hans", 190, 40);
        g.drawString(a + "kg", 50, 50);
        g.drawString(b + "kg", 120, 50);
        g.drawString(c + "kg", 190, 50);
    }

}
