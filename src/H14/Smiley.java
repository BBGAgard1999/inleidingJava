package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Objects;

public class Smiley extends Applet {
    private TextField tekstvak;
    private String aantal;
    private String weggehaald;
    private Color kleur;
    private int y;
    private int y2;
    private boolean gewonnen;
    private boolean verloren;
    private URL pad;
    private int afbeeldingen = 23;
    private String soort;
    private String einde;

    public void init(){
        einde = "verdrietig";
        soort = "basic";
        pad = Smiley.class.getResource("/resources/");
        gewonnen = false;
        verloren = false;
        kleur = Color.black;
        y = 40;
        y2 = 40;
        setSize(555, 615);
        Label label = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new KnopListener());
        Button knop = new Button("Speel");
        knop.addActionListener( new KnopListener());
        aantal = "Aantal smileys: "+ afbeeldingen +" . Jouw beurt";
        weggehaald = "";
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint (Graphics g) {
        int x = getWidth() / 2 - 238;
        g.setColor(kleur);
        g.drawString(aantal, x, y);
        g.drawString(weggehaald, x, y2);
        Image resultaat;
        if (gewonnen) {
            weggehaald = "Hmmm... je hebt gewonnen";
            aantal = "";
            resultaat = getImage(pad, einde + ".png");
            g.drawImage(resultaat, 50, 50, 150, 150, this);
        }
        if (verloren) {
            weggehaald = "Ha!!! Je hebt verloren.";
            aantal = "";
            afbeeldingen = 0;
            resultaat = getImage(pad, einde + ".png");
            g.drawImage(resultaat,
                    -100+(getWidth()/2-resultaat.getWidth(this)/2),
                    -125+(getHeight()/2-resultaat.getHeight(this)/2),
                    150, 150, this);
        }
        int iAfbeeldingen = 0;
        Image afbeelding = getImage(pad, soort + ".png");
        for (int rij = -2; rij <= 3; rij++) {
            for (int kolom = -2; kolom <= 1; kolom++) {
                if (iAfbeeldingen < afbeeldingen) {
                    g.drawImage(afbeelding,
                            (kolom*50)+(getWidth()/2-afbeelding.getWidth(this)/2),
                            (rij*75)+(getHeight()/2-afbeelding.getHeight(this)/2),
                            afbeelding.getWidth(this), afbeelding.getHeight(this), this
                    );
                }
                iAfbeeldingen++;
            }
        }
    }


    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!gewonnen && !verloren) {
                int computer;
                int invoerGetal = Integer.parseInt(tekstvak.getText());
                if (invoerGetal >= 1 && invoerGetal <= 3) {
                    afbeeldingen -= invoerGetal;
                    if (Objects.equals(soort, "blij") && afbeeldingen < 1) {
                        verloren = true;
                    }
                    if ((afbeeldingen-1)%4 != 0) {
                        computer = 1+((afbeeldingen-1)%4-1);
                        afbeeldingen -= computer;
                        soort = "blij";
                        einde = "haha";
                    }
                    else {
                        computer = (int)(Math.random()*3+1);
                        afbeeldingen -= computer;
                    }
                    if (afbeeldingen < 1 && !verloren) {
                        gewonnen = true;
                    }
                    if (computer == 1) {
                        kleur = Color.black;
                        weggehaald = "De computer heeft "+ computer +" smileys weggehaald.";
                        aantal = "Aantal smileys: "+ afbeeldingen +" . Jouw beurt";
                        y = 55;
                    }
                    else {
                        kleur = Color.black;
                        weggehaald = "De computer heeft "+ computer +" smileys weggehaald.";
                        aantal = "Aantal smileys: "+ afbeeldingen +" . Jouw beurt";
                        y = 55;
                    }
                }
                else {
                    kleur = Color.red;
                    weggehaald = "Onjuiste invoer";
                    aantal = "";
                }
            }
            tekstvak.setText(" ");
            tekstvak.setText("");
            tekstvak.requestFocus();
            repaint();
        }
    }
}
