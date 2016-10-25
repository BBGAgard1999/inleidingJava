package H11;

import java.awt.*;
import java.applet.*;


public class HonderdCirkels extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        int y2 = 325;
        int x2 = 325;

        for(teller = 0; teller < 100; teller++) {
            x += 6;
            y += 6;
            x2 -= 3;
            y2 -= 3;
            g.drawOval(x2 , y2, x, y );
        }
    }
}