import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;



public class stensaxp�se extends JFrame implements ActionListener{
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JLabel spelare = new JLabel("Spelare: ");
	JLabel dator = new JLabel("Datorn: ");
	JLabel spelarep = new JLabel("Spelarens po�ng: 0");
	JLabel datorp = new JLabel("Datorns po�ng: 0");
	JButton sten = new JButton("Sten");
	JButton sax  = new JButton("Sax");
	JButton p�se = new JButton("P�se");
	JButton sten2 = new JButton("Sten");
	JButton sax2  = new JButton("Sax");
	JButton p�se2 = new JButton("P�se");
	private int p1, p2; 
	
	public stensaxp�se(){
		setLayout(new GridLayout(3,2));
		add(spelare); pan.add(sten); pan.add(sax); pan.add(p�se);
		add(dator); pan2.add(sten2); pan2.add(sax2); pan2.add(p�se2);
		add(pan); add(pan2); add(spelarep); add(datorp);
		sten.addActionListener(this);
	    sax.addActionListener(this);
	    p�se.addActionListener(this);
		setSize(350,300);
	    setVisible(true);
	}
	
	public static void main (String[] arg) {
	      stensaxp�se s = new stensaxp�se();
	      
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		sten2.setEnabled(true);
		sax2.setEnabled(true);
		p�se2.setEnabled(true);
		
		try {
			    Thread.sleep(200);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
		}
		int d = (int) (Math.random()*3);
		if(d==0){
			sten2.setEnabled(false);
		}else if(d==1){
			sax2.setEnabled(false);
		}else if(d==2){
			p�se2.setEnabled(false);
		}
		if(e.getSource() == sten){
			if(d==0){
				
			}else if(d==1){
				spelarep.setText("Spelarens po�ng: " + String.valueOf(++p1));
			}else if(d==2){
				datorp.setText("Datorns po�ng: " + String.valueOf(++p2));
			}
		}
		if(e.getSource() == sax){
			if(d==0){
				datorp.setText("Datorns po�ng: " + String.valueOf(++p2));
			}else if(d==1){
				
			}else if(d==2){
				spelarep.setText("Spelarens po�ng: " + String.valueOf(++p1));
			}
		}
		if(e.getSource() == p�se){
			if(d==0){
				spelarep.setText("Spelarens po�ng: " + String.valueOf(++p1));
			}else if(d==1){
				datorp.setText("Datorns po�ng: " + String.valueOf(++p2));
			}else if(d==2){
				
			}
		}
	}
	
}
