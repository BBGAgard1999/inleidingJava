package H11;

import java.awt.*;
import java.applet.*;


public class Cirkels extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        int y2 = 50;
        int x2 = 50;

        for(teller = 0; teller < 5; teller++) {
            x += 14;
            y += 14;
            x2 -= 7;
            y2 -= 7;
            g.drawOval(x2 , y2, x, y );
        }
    }
}

