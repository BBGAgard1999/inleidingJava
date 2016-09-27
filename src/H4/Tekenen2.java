package H4;

import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillRect(100, 100, 100, 50);
        g.setColor(Color.red);
        g.fillRect(120, 120, 20, 30);
        g.fillRect(160, 120, 20, 20);
    }
}