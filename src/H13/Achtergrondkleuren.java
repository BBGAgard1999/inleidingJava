package H13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Achtergrondkleuren extends Applet {

    private String string = "";

    public void init() {
        setSize(400, 300);
        knoppen();
    }

    public void paint(Graphics g) {
        g.drawString(""+ string, 150, 50);
    }

    private void knoppen() {
        Color[] kleuren = {Color.red, Color.green, Color.blue, Color.yellow, Color.orange};
        String[] strings = {"Rood", "Groen", "Blauw", "Geel", "Oranje"};
        Button[] knoppen = new Button[kleuren.length];

        for (int i = 0; i < kleuren.length; i++) {
            knoppen[i] = new Button(strings[i]);
            add(knoppen[i]);
            knoppen[i].addActionListener(new Listener());
            knoppen[i].setBackground(kleuren[i]);
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button src = (Button)e.getSource();
            setBackground(src.getBackground());
            string = src.getLabel();
            repaint();
        }
    }

}