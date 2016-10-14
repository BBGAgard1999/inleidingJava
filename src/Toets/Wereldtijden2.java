package Toets;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//Created by Jarod de Cleen on 12-10-2016.

public class Wereldtijden2 extends Applet {
    private TextField tekstvak;
    private String london2;
    private String tokyo2;
    private String newyork2;
    private String sydney2;

    public void init () {
        Label label = new Label("Voer een uur in");
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new KnopListener ());
        Button knop = new Button("Toon Tijden");
        knop.addActionListener( new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);

    }

    public void paint (Graphics g) {
        g.drawString(london2, 50, 60);
        g.drawString(tokyo2, 50, 75);
        g.drawString(newyork2, 50, 90);
        g.drawString(sydney2, 50, 105);
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String t = tekstvak.getText();
            int tijd = Integer.parseInt(t);
            int london = tijd - 1;
            int tokyo = tijd + 7;
            int newyork = tijd - 6;
            int sydney = tijd + 9;
            if (london < 0 ) {
                london2 = "Tijd in London: " + (london + 24) + ":00 uur";
            }
            else {
                london2 = "Tijd in London: " + london + ":00 uur";
            }
            if (tokyo > 23 ) {
                tokyo2 = "Tijd in Tokyo: " + (tokyo - 24) + ":00 uur";
            }
            else {
                tokyo2 = "Tijd in Tokyo: " + tokyo + ":00 uur";
            }
            if (newyork < 0 ) {
                newyork2 = "Tijd in New York: " + (newyork + 24) + ":00 uur";
            }
            else {
                newyork2 = "Tijd in New York: " + newyork + ":00 uur";
            }
            if (sydney > 23 ) {
                sydney2 = "Tijd in Sydney: " + (sydney - 24) + ":00 uur";
            }
            else {
                sydney2 = "Tijd in London: " + sydney + ":00 uur";
            }
            if (tijd > 23){
                london2 = "Ongeldige invoer";
                tokyo2 = "";
                newyork2 = "";
                sydney2 = "";
            }
            if (tijd < 0){
                london2 = "Ongeldige invoer";
                tokyo2 = "";
                newyork2 = "";
                sydney2 = "";
            }
            repaint();
        }
    }
}
