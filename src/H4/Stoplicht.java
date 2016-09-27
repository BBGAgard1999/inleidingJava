package H4;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100, 100, 100, 300);
        setBackground(Color.blue);
        g.setColor(Color.red);
        g.fillOval(100, 100, 100, 100);
        g.setColor(Color.orange);
        g.fillOval(100, 200, 100, 100);
        g.setColor(Color.green);
        g.fillOval(100, 300, 100, 100);
    }

}