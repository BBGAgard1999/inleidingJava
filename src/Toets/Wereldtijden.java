package Toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Created by Jarod de Cleen on 12-10-2016.

public class Wereldtijden extends Applet {
    private TextField tekstvak;
    private String london;
    private String tokyo;
    private String newyork;
    private String sydney;

    public void init () {
        Label label = new Label("Voer een uur in");
        london = "";
        tokyo = "";
        newyork = "";
        sydney = "";
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new KnopListener ());
        Button knop = new Button("Toon Tijden");
        knop.addActionListener( new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);

    }

    public void paint (Graphics g) {
        g.drawString(london, 50, 60);
        g.drawString(tokyo, 50, 75);
        g.drawString(newyork, 50, 90);
        g.drawString(sydney, 50, 105);
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String t = tekstvak.getText();
            int tijd = Integer.parseInt(t);
            switch (tijd) {
                case 0:
                    london = "Tijd in London: " + (tijd - 1 + 24) + ":00 uur";
                    tokyo = "Tijd in Tokyo: " + (tijd + 7) + ":00 uur";
                    newyork = "Tijd in New York: " + (tijd - 6 + 24) + ":00 uur";
                    sydney = "Tijd in Sydney: " + (tijd + 9) + ":00 uur";
                    break;
                case 1: case 2: case 3: case 4: case 5:
                    london = "Tijd in London: " + (tijd - 1) + ":00 uur";
                    tokyo = "Tijd in Tokyo: " + (tijd + 7) + ":00 uur";
                    newyork = "Tijd in New York: " + (tijd - 6 + 24) + ":00 uur";
                    sydney = "Tijd in Sydney: " + (tijd + 9) + ":00 uur";
                    break;
                case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14:
                    london = "Tijd in London: " + (tijd - 1) + ":00 uur";
                    tokyo = "Tijd in Tokyo: " + (tijd + 7) + ":00 uur";
                    newyork = "Tijd in New York: " + (tijd - 6) + ":00 uur";
                    sydney = "Tijd in Sydney: " + (tijd + 9) + ":00 uur";
                    break;
                case 15: case 16:
                    london = "Tijd in London: " + (tijd - 1) + ":00 uur";
                    tokyo = "Tijd in Tokyo: " + (tijd + 7) + ":00 uur";
                    newyork = "Tijd in New York: " + (tijd - 6) + ":00 uur";
                    sydney = "Tijd in Sydney: " + (tijd + 9 - 24) + ":00 uur";
                    break;
                case 17: case 18: case 19: case 20: case 21: case 22: case 23:
                    london = "Tijd in London: " + (tijd - 1) + ":00 uur";
                    tokyo = "Tijd in Tokyo: " + (tijd + 7 - 24) + ":00 uur";
                    newyork = "Tijd in New York: " + (tijd - 6) + ":00 uur";
                    sydney = "Tijd in Sydney: " + (tijd + 9 - 24) + ":00 uur";
                    break;
                default:
                    london = "Ongeldige invoer";
                    tokyo = "";
                    newyork = "";
                    sydney = "";
                    break;
            }
            repaint();
        }
    }
}
