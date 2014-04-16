import javax.swing.*;
import java.awt.*;

public class Applet extends JApplet {
	public void init() {
		JLabel l = new JLabel ("Välkommen till Java Direkt" , JLabel.CENTER);
		
		add(l);
		l.setOpaque (true);
		l.setBackground(Color.yellow);
		l.setForeground(Color.blue);
		l.setFont(new Font ("SansSerif", Font.BOLD, 24));
	
	}

}