package H7H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jdecl_000 on 16-9-2016.
 */
public class Knop5 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;
    Label label;
    Label label2;
    Label label3;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Button knop;

    public void init() {
        label = new Label("Valerie");
        add(label);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        label2 = new Label("Jeroen");
        add(label2);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        label3 = new Label("Hans");
        add(label3);
        tekstvak3= new TextField("", 20);
        add(tekstvak3);
        knop = new Button("Wijzig waardes");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        a = 40;
        b = 100;
        c = 80;

        uitkomst = a * 2;
        uitkomst2 = b * 2;
        uitkomst3 = c * 2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(50, 350, 50, -uitkomst);
        g.setColor(Color.yellow);
        g.fillRect(120, 350, 50, -uitkomst2);
        g.setColor(Color.blue);
        g.fillRect(190, 350, 50, -uitkomst3);
        g.setColor(Color.black);
        g.drawString(uitkomst + "kg", 50, 365);
        g.drawString(uitkomst2 + "kg", 120, 365);
        g.drawString(uitkomst3 + "kg", 190, 365);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak2.getText();
            String f = tekstvak3.getText();
            uitkomst = Integer.parseInt( s );
            uitkomst2 = Integer.parseInt( d );
            uitkomst3 = Integer.parseInt( f );
            repaint();
        }
    }

}