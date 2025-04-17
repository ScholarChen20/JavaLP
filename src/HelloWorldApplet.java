import org.junit.jupiter.api.Test;

import java.io.*;
import java.applet.*;
import java.awt.*;
/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HelloWorldApplet extends Applet {
    @Test
    public void paint(Graphics g) {
//        g.setColor(Color.red);
        g.drawString("Hello World!", 10, 20);
    }
}
