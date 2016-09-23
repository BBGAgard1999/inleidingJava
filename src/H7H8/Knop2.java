package H7H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knop2 extends Applet {
    Label label;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String M;
    String V;
    String VL;
    String ML;
    String total;
    int a;
    int b;
    int c;
    int d;
    int totaal;

    public void init() {
        M = "";
        V = "";
        VL = "";
        ML = "";
        a = 9;
        b = 8;
        c = 11;
        d = 15;
        totaal = a + b + c + d;
        label = new Label("School avond");
        add(label);
        knop = new Button("1");
        KnopListener kl = new KnopListener2();
        knop.addActionListener( kl );
        add(knop);
        knop2 = new Button("2");
        KnopListener kp = new KnopListener2();
        knop2.addActionListener( kp );
        add(knop2);
        knop3 = new Button("3");
        KnopListener kb = new KnopListener();
        knop3.addActionListener( kb );
        add(knop3);
        knop4 = new Button("4");
        KnopListener kk = new KnopListener2();
        knop4.addActionListener( kk );
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString(M, 60, 60 );
        g.drawString(V, 60, 75 );
        g.drawString(VL, 60, 90 );
        g.drawString(ML, 60, 105 );
        g.drawString(total, 60, 130);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            M = "Mannen: " + a;
            V = "Vrouwen: " + b;
            VL = "Potentiële vrouwelijke leerlingen: " + c;
            ML = "Potentiële mannelijke leerlingen: " + d;
            total = "Totaal: " + totaal;
            repaint();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
        }
    }
}