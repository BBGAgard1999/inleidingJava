package H13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Muren extends Applet {

    private Color kleur;
    private int grootte;

    public void init() {
        setSize(400, 400);
        grootte = 0;
        kleur = null;
        Button baksteen = new Button("Baksteen");
        add(baksteen);
        baksteen.addActionListener(new BaksteenListener());
        Button beton = new Button("Beton");
        add(beton);
        beton.addActionListener(new BetonListener());
    }

    public void paint(Graphics g) {
        tekenMuur(g);
    }

    private void tekenMuur(Graphics g) {
        g.setColor(kleur);
        for (int Rij = 2; 2+25*Rij < getHeight(); Rij++) {
            for (int Kolom = 0; 2+52*(Kolom-1) < getWidth(); Kolom++) {
                if (Rij % 2 == 0) {g.fillRect(grootte *(2+52*Kolom), grootte *(2+22*Rij), grootte *50, grootte *20);}
                else {g.fillRect(grootte *(-25+52*Kolom), grootte *(2+22*Rij), grootte *50, grootte *20);}
            }
        }
    }

    private class BaksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = Color.red;
            grootte = 1;
            repaint();
        }
    }

    private class BetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = Color.lightGray;
            grootte = 2;
            repaint();
        }
    }
}