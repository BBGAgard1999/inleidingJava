package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Objects;

public class Kaarten extends Applet {

    private String[] vorm = {"Harten", "Schoppen", "Ruiten", "Klaver"};
    private String[] cijfer = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien",
            "boer", "vrouw", "heer", "aas"};
    private AudioClip sound;
    private String[] stapel = new String[52];
    private String[] speler1;
    private String[] speler2;
    private String[] speler3;
    private String[] speler4;


    public void init() {
        speler1 = new String [stapel.length/4];
        speler2 = new String [stapel.length/4];
        speler3 = new String [stapel.length/4];
        speler4 = new String [stapel.length/4];

        URL pad = Kaarten.class.getResource("/resources/");
        sound = getAudioClip(pad, "applaus.wav");
        setSize(546, 300);
        Button knop = new Button("Deel kaart");
        knop.addActionListener(new Listener());
        add(knop);
    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 50;
        for (int i = 1; i < 5; i++) {
            x+=100;
            g.drawString("Speler" + i, x, y);
            for (int j = 0; j < 13; j++) {
                g.drawString("" + speler1[j], 100, 80 + j * 10);
                g.drawString("" + speler2[j], 200, 80 + j * 10);
                g.drawString("" + speler3[j], 300, 80 + j * 10);
                g.drawString("" + speler4[j], 400, 80 + j * 10);
            }
        }
    }

    private String kaartDelen() {
        String kaartGekozen = stapel[(int)(Math.random()*stapel.length)];

        int iTemp = 0;
        String[] temp = new String[stapel.length-1];
        for (String aStapel : stapel) {
            if (!Objects.equals(aStapel, kaartGekozen)) {
                temp[iTemp] = aStapel;
                iTemp++;
            }
        }
        stapel = temp;

        return kaartGekozen;
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sound.play();
            stapel = new String[52];
            int iStapel = 0;
            for (String aVorm : vorm) {
                for (String aCijfer : cijfer) {
                    stapel[iStapel] = aVorm + aCijfer;
                    iStapel++;
                }
            }
            for (int iDeal = 0; iDeal < 13; iDeal++) {
                speler1[iDeal] = kaartDelen();
                speler2[iDeal] = kaartDelen();
                speler3[iDeal] = kaartDelen();
                speler4[iDeal] = kaartDelen();
            }
            repaint();
        }
    }

}