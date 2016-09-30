package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class HoogsteGetal extends Applet {

    int getal;
    int getal2;
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener( new VakListener() );
        tekst = "";
        label = new Label("Type getallen in de tekstvakken" );
        add( label );
        add( tekstvak );
        add( tekstvak2 );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
            String d;

            s = tekstvak.getText();
            d = tekstvak2.getText();
            getal = Integer.parseInt( s );
            getal2 = Integer.parseInt( d );
            if ( getal > getal2 ) {
                tekst = "Hoogste getal: " + getal;
            }
            if ( getal2 > getal ) {
                tekst = "Hoogste getal: " + getal2;
            }
            repaint();
        }
    }
}