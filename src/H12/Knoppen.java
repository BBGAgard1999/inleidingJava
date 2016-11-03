package H12;

import java.awt.*;
import java.applet.*;

public class Knoppen extends Applet  {

    public void init() {
        Button[] knop = new Button[25];

        for (int teller = 1; teller <= knop.length; teller++) {
            knop[1] = new Button ("" + teller);
            add(knop[1]);
        }
    }
}