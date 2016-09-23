package H7H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knop3 extends Applet {
    Label label;
    Button knop;
    String schermtekst;
    TextField tekstvak;
    double btw;
    double uitkomst;

    public void init() {
        schermtekst = "";
        label = new Label("Type een cijfer in het tekstvakje: ");
        add(label);
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        tekstvak = new TextField("", 20);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst + BTW: " + uitkomst, 100, 100 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            btw = Double.parseDouble( s ) / 100 * 21;
            uitkomst = Double.parseDouble( s ) + btw;
            repaint();
        }
    }

}