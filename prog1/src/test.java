import javax.swing.*;
import java.awt.*;

public class test {
	public static void main (String [] arg){
		Direkt2 d2 = new Direkt2();
		
	}
}

class Direkt2 extends JFrame {
	public Direkt2() {
		JLabel l = new JLabel("Blubb!", JLabel.CENTER);
		add(l);
		l.setOpaque(true);
		l.setBackground(Color.yellow);
		l.setForeground(Color.blue);
		l.setFont(new Font("SansSerif", Font.BOLD, 24));
		setSize(Toolkit.getDefaultToolkit().getScreenSize()); // helsk�rm
		validate();
		setVisible(true);
		setLocationRelativeTo(null);
	}
}