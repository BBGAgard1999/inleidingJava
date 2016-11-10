package H13;

import java.applet.Applet;
import java.awt.*;

public class Muur extends Applet {

    public void init(){
        setSize(400, 400);
    }

    public void paint (Graphics g) {
        tekenMuur(g);
    }

    private void tekenMuur(Graphics g) {
        g.setColor(Color.red);
        for (int rij = 2; 2+25*rij < getHeight(); rij++) {
            for (int kolom = 0; 2+52*(kolom-1) < getWidth(); kolom++) {
                if (rij % 2 == 0) {g.fillRect(2+52*kolom, 2+22*rij, 50, 20);}
                else {g.fillRect(-25+52*kolom, 2+22*rij, 50, 20);}
            }
        }
    }


}
