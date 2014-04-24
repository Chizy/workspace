import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Schema extends JLabel{
	private JPanel[] pl = new JPanel[5];
	private Rast[] rast = new Rast[20];
	private Lektion[] platser= new Lektion[25];
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	int ks = 0;
	
	public Schema(){
		this.setPreferredSize(new Dimension(1100,610));
		this.setLayout(new FlowLayout());
		p1.setPreferredSize(new Dimension(30,600));
		p1.setBackground(Color.white);
		this.add(p1, BorderLayout.WEST);
		for(int i=0;i<5;i++){
			pl[i] = new JPanel();
			pl[i].setPreferredSize(new Dimension(200,600));
			pl[i].setBackground(Color.gray);
			pl[i].setLayout(new FlowLayout());
			this.add(pl[i]);
		}
		p2.setPreferredSize(new Dimension(30,600));
		p2.setBackground(Color.white);
		this.add(p2, BorderLayout.EAST);
		for(int k=0;k<25;k++){
			platser[k] = new Lektion();
		}
		for(int i=0;i<5;i++){
			for(int i2=0;i2<9;i2++){
				if(i2%2==0){
					pl[i].add(platser[ks]);
					ks++;
				}else if(i2==3){
					rast[i2] = new LunchRast();
					pl[i].add(rast[i2]);
				}else{
					rast[i2] = new Rast();
					pl[i].add(rast[i2]);
				}
			}
		}
		this.setVisible(true);
	}

	public int getFriPlats(int n) {
		int p = -1;
		int i = n;
		int i2 = -1;
		while(i<25){
			p = platser[i].getUpptagen();
			if(p==0){
				i2 = i;
				break;
			}
			i++;
		}
		return i2;
	}
	public int getPlats(int i) {
		return platser[i].getUpptagen();
	}
	public void setKursPlats(int p, Kurs k) {
		platser[p].setKurs(k);
	}
	public void setSalPlats(int p, Sal s) {
		platser[p].setSal(s);
	}
	public void setLektion(int p) {
		platser[p].setLektionNamn();
	}
}
