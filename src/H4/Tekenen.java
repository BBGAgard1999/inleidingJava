package H4;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(400, 200, 200, 200);
        g.drawLine(300, 20, 200, 200);
        g.drawLine(300, 20, 400, 200);
    }
}