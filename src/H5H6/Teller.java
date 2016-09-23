package H5H6;

import java.applet.Applet;
import java.awt.*;

public class Teller extends Applet {
    int seconden;
    int uur;
    int dag;
    int jaar;

    public void init() {

        seconden = 1;
        uur = seconden * 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("1 uur = " + uur + " seconden" , 50, 60);
        g.drawString("1 dag = " + dag + " seconden" , 50, 75);
        g.drawString("1 jaar = " + jaar + " seconden" , 50, 90);
    }


}
