import java.awt.*;
import java.util.ArrayList;

import javax.swing.JLabel;


public class Lektion extends JLabel{
	private String sal;
	private Kurs kurs;
	private ArrayList<Schema> schema = new ArrayList<Schema>();
	
	public Lektion(){
		this.setPreferredSize(new Dimension(200,90));
		this.setBackground(Color.white);
		this.setVisible(true);
	}
	public String getSal(){
		return sal;
	}
	public String getLektionNamn(){
		return kurs.getKursNamn();
	}
}
