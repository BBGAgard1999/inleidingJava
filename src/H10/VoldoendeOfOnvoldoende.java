package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class VoldoendeOfOnvoldoende extends Applet {

    private double uitkomst;
    private TextField tekstvak, tekstvak2, tekstvak3, tekstvak4;
    private String wis, nl, en, eco, eindcijfer;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener( new VakListener() );
        tekstvak3 = new TextField("", 5);
        tekstvak3.addActionListener( new VakListener() );
        tekstvak4 = new TextField("", 5);
        tekstvak4.addActionListener( new VakListener() );
        Button ok = new Button("Ok");
        VakListener kl = new VakListener();
        ok.addActionListener( kl );
        wis = "";
        nl = "";
        en = "";
        eco = "";
        eindcijfer = "";
        Label label = new Label("Type je cijfers in de tekstvakken (cijfers zijn 1 t/m 10)");
        add(label);
        add( tekstvak );
        add( tekstvak2 );
        add( tekstvak3 );
        add( tekstvak4 );
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Wiskunde: " + wis, 50, 45 );
        g.drawString("Nederlands: " + nl, 50, 60 );
        g.drawString("Engels: " + en, 50, 75 );
        g.drawString("Economie: " + eco, 50, 90 );
        g.drawString("Gemiddelde: " + uitkomst, 50, 105 );
        g.drawString("Eindcijfer: " + eindcijfer, 50, 120 );
    }

    private class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
            String d;
            String f;
            String g;

            s = tekstvak.getText();
            d = tekstvak2.getText();
            f = tekstvak3.getText();
            g = tekstvak4.getText();
            double wiscijfer = Double.parseDouble(s);
            double nlcijfer = Double.parseDouble(d);
            double encijfer = Double.parseDouble(f);
            double ecocijfer = Double.parseDouble(g);

            double gemiddelde = (wiscijfer + nlcijfer + encijfer + ecocijfer) / 4;
            int i = (int) (gemiddelde * 10);
            uitkomst = (double) i / 10;

            if ( wiscijfer > 5.5 ) {
                wis = "Voldoende";
                }
                else {
                    wis = "Onvoldoende";
                }

            if ( nlcijfer > 5.5 ) {
                nl = "Voldoende";
            }
            else {
                nl = "Onvoldoende";
            }

            if ( encijfer > 5.5 ) {
                en = "Voldoende";
            }
            else {
                en = "Onvoldoende";
            }

            if ( ecocijfer > 5.5 ) {
                eco = "Voldoende";
            }
            else {
                eco = "Onvoldoende";
            }

            if ( uitkomst > 5.5 ) {
                eindcijfer = "Geslaagd";
            }
            else {
                eindcijfer = "Gezakt";
            }

            repaint();
        }

    }
}
