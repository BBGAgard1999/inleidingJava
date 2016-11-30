package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kaart extends Applet {

    private String[] vorm = {"Harten", "Schoppen", "Ruiten", "Klaver"};
    private String[] cijfer = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien",
            "boer", "vrouw", "heer", "aas"};
    private String gedeeld;

    public void init() {
        setSize(300, 100);
        gedeeld = "";
        Button knop = new Button("Deel kaart");
        knop.addActionListener(new Listener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + gedeeld, 100, 50);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String vormgekozen = vorm[(int) (Math.random() * vorm.length)];
            String cijfergekozen = cijfer[(int) (Math.random() * cijfer.length)];
            gedeeld = vormgekozen + " " + cijfergekozen;
            repaint();
        }
    }

}
