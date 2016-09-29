package H4;

import java.awt.*;
import java.applet.*;

public class NederlandseFlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 30);
        g.setColor(Color.white);
        g.fillRect(100, 130, 200, 30);
        g.setColor(Color.blue);
        g.fillRect(100, 160, 200, 30);
        g.setColor(Color.black);
        g.drawLine(100, 500, 100, 100);
        g.drawLine(300, 190, 300, 100);
        g.drawLine(300, 100, 100, 100);
        g.drawLine(300, 190, 100, 190);
    }
}