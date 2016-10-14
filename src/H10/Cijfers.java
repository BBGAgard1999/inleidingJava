package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Cijfers extends Applet {
    private TextField tekstvak;
    private String tekst;

    public void init() {
        tekstvak = new TextField("", 20);
        Label label = new Label("Type je cijfer en druk op enter");
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
            int cijfer = Integer.parseInt(s);
            switch(cijfer) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "U hebt een verkeerd cijfer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
