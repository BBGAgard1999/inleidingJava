package H7H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OpenAvond extends Applet {
    Label label;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int a;
    int b;
    int c;
    int d;
    int totaal;

    public void init() {
        label = new Label("School avond");
        add(label);
        knop = new Button("Man");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        knop2 = new Button("Vrouw");
        KnopListener kp = new KnopListener2();
        knop2.addActionListener( kp );
        add(knop2);
        knop3 = new Button("Potentiële mannelijke leerling");
        KnopListener kb = new KnopListener3();
        knop3.addActionListener( kb );
        add(knop3);
        knop4 = new Button("Potentiële vrouwelijke leerling");
        KnopListener kk = new KnopListener4();
        knop4.addActionListener( kk );
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen: " + a, 60, 60 );
        g.drawString("Vrouwen: " + b, 60, 75 );
        g.drawString("Potentiële vrouwelijke leerlingen: " + c, 60, 90 );
        g.drawString("Potentiële mannelijke leerlingen: " + d, 60, 105 );
        g.drawString("Totaal: " + totaal, 60, 130);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            a++;
            totaal = a + b + c + d;
            repaint();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            b++;
            totaal = a + b + c + d;
            repaint();
        }
    }

    private class KnopListener3 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            c++;
            totaal = a + b + c + d;
            repaint();
        }
    }

    private class KnopListener4 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            d++;
            totaal = a + b + c + d;
            repaint();
        }
    }
}