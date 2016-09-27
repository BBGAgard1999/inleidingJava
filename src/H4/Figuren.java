import java.awt.*;
import java.applet.*;
/**
 * Created by jdecl_000 on 16-9-2016.
 */
public class Figuren extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
        g.drawRoundRect(20, 80, 100, 50, 20, 20);
        g.drawOval(265, 80, 50, 50);
        g.drawOval(240, 20, 100, 50);
        g.setColor(Color.magenta);
        g.fillRect(130, 20, 100, 50);
        g.fillOval(130, 80, 100, 50);
        g.fillArc(240, 20, 100, 50, 0, 45);
        g.setColor(Color.blue);
        g.drawOval(130, 20, 100, 50);
    }
}