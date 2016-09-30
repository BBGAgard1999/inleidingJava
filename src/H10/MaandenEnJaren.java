package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class MaandenEnJaren extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, d, tekst, tekst2;
    int maand;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 300, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            d = tekstvak2.getText();
            maand = Integer.parseInt( s );
            switch(maand) {
                case 1:
                    tekst = "Maand: Januari Aantal dagen: 31";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        tekst = "Maand: Februari, Aantal dagen: 29";
                    }
                    else {
                        tekst = "Maand: Februari, Aantal dagen: 28";
                    }
                    break;
                case 3:
                    tekst = "Maand: Maart, Aantal dagen: 31";
                    break;
                case 4:
                    tekst = "Maand: April, Aantal dagen: 30";
                    break;
                case 5:
                    tekst = "Maand: Mei, Aantal dagen: 31";
                    break;
                case 6:
                    tekst = "Maand: Juni, Aantal dagen: 30";
                    break;
                case 7:
                    tekst = "Maand: Juli, Aantal dagen: 31";
                    break;
                case 8:
                    tekst = "Maand: Augustus, Aantal dagen: 31";
                    break;
                case 9:
                    tekst = "Maand: September, Aantal dagen: 30";
                    break;
                case 10:
                    tekst = "Maand: Oktober, Aantal dagen: 31";
                    break;
                case 11:
                    tekst = "Maand: November, Aantal dagen: 30";
                    break;
                case 12:
                    tekst = "Maand: December, Aantal dagen: 31";
                    break;
                case 0:
                    tekst = "0 is geen maandnummer...";
                    break;
                default:
                    tekst = "Er zijn maar 12 maanden ..!";
                    break;
            }
            jaartal = Integer.parseInt( d );
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}