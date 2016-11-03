package H12;

import java.awt.*;
import java.applet.*;

public class Tabel extends Applet {
    private double getal[];
    private double uitkomst;

    public void init() {
        getal = new double [10];

        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 5 * teller + 7;
            uitkomst = (getal[0] + getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] +
                    getal[8] + getal[9]) / 10;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("Het gemiddelde is " + uitkomst, 50, 220);
        }
    }
}