package H11;

import java.awt.*;
import java.applet.*;


public class Vierkanten extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        int y2 = 20;
        int x2 = 20;

        for(teller = 0; teller < 5; teller++) {
            x += 20;
            y += 20;
            x2 += 20;
            y2 += 20;
            g.drawLine(x , y, x2, y );
            g.drawLine(x , y2, x2, y2 );
            g.drawLine(x , y, x, y2 );
            g.drawLine(x2 , y, x2, y2 );

        }
    }
}
