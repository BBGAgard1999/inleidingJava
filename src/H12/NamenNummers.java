package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NamenNummers extends Applet {

    private TextField tekstvaknaam;
    private TextField tekstvaknummer;
    private String[] stringnaam;
    private String[] stringnummer;
    private int teller;

    public void init() {
        teller = 0;
        Label naam = new Label("Naam: ");
        Label nummer = new Label("Telefoonnummer: ");
        tekstvaknaam = new TextField("", 15);
        tekstvaknummer = new TextField("", 15);
        stringnaam = new String[10];
        stringnummer = new String[10];
        Button knop = new Button("Ok");
        knop.addActionListener(new Listener());
        add(naam);
        add(tekstvaknaam);
        add(nummer);
        add(tekstvaknummer);
        add(knop);
        for (int o = 0; o < stringnaam.length; o++) {
            stringnaam[o] = "";
            stringnummer[o] = "";
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < stringnaam.length; i++) {
            if (teller == 10) {
                g.drawString("" + stringnaam[i], 100, (20 * stringnaam.length / 2) + 35 * i);
                g.drawString("" + stringnummer[i], 100, (20 * stringnaam.length / 2) + 15 + 35 * i);
            }
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            stringnaam[(teller - 1)] = "Naam: " + tekstvaknaam.getText();
            stringnummer[(teller - 1)] = "Telefoon: " + tekstvaknummer.getText();
            tekstvaknaam.setText("");
            tekstvaknummer.setText("");
            tekstvaknaam.requestFocus();
            repaint();
        }

    }
}