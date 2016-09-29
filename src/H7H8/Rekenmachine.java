package H7H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rekenmachine extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak2;
    double getal;
    double uitkomst;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        knop = new Button("*");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        knop2 = new Button("/");
        KnopListener kp = new KnopListener2();
        knop2.addActionListener( kp );
        add(knop2);
        knop3 = new Button("+");
        KnopListener kb = new KnopListener3();
        knop3.addActionListener( kb );
        add(knop3);
        knop4 = new Button("-");
        KnopListener kk = new KnopListener4();
        knop4.addActionListener( kk );
        add(knop4);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak2.getText();
            getal = Double.parseDouble( d );
            uitkomst = Double.parseDouble( s ) * getal;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak2.getText();
            getal = Double.parseDouble( d );
            uitkomst = Double.parseDouble( s ) / getal;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    private class KnopListener3 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak2.getText();
            getal = Double.parseDouble( d );
            uitkomst = Double.parseDouble( s ) + getal;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    private class KnopListener4 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak2.getText();
            getal = Double.parseDouble( d );
            uitkomst = Double.parseDouble( s ) - getal;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }
}