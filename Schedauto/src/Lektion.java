import java.awt.*;
import java.util.ArrayList;

import javax.swing.JLabel;


public class Lektion extends JLabel{
	private Sal sal;
	private Kurs kurs;
	
	public Lektion(){
		this.setPreferredSize(new Dimension(200,90));
		this.setBackground(Color.white);
		this.setOpaque(true);
		this.setVisible(true);
	}
	public Sal getSal(){
		return sal;
	}
	public int getUpptagen(){
		int i = 0;
		if(this.getBackground() != Color.white){
			i = 1;
		}
		return i;
	}
	public void setLektionNamn(){
		this.setText(kurs.getKursNamn()+"\n"+sal.getNamn()+"\n"+kurs.getLärareInNamn());
		this.setBackground(kurs.getColor());
	}
	public void setKurs(Kurs k) {
		kurs = k;
	}
	public void setSal(Sal s) {
		sal = s;
	}
	
}
