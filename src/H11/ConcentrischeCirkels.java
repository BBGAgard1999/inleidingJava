package H11;

import java.awt.*;
import java.applet.*;


public class ConcentrischeCirkels extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        int y2 = 275;
        int x2 = 275;

        for(teller = 0; teller < 50; teller++) {
            x += 10;
            y += 10;
            x2 -= 5;
            y2 -= 5;
            g.drawOval(x2 , y2, x, y );
        }
    }
}