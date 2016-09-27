package H4;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.white);
        g.fillRoundRect(100, 100, 100, 100, 20, 20);
        g.setColor(Color.black);
        g.fillOval(110, 110, 30, 30);
        g.fillOval(160, 110, 30, 30);
        g.fillOval(110, 160, 30, 30);
        g.fillOval(160, 160, 30, 30);
    }

}