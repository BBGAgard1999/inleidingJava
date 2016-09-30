package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Maanden extends Applet {
    private TextField tekstvak;
    private String tekst;

    public void init() {
        tekstvak = new TextField("", 20);
        Label label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    private class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    tekst = "Maand: Januari Aantal dagen: 31";
                    break;
                case 2:
                    tekst = "Maand: Februari, Aantal dagen: 28 of 29";
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
            repaint();
        }
    }
}
