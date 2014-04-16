import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;



public class stensaxpåse extends JFrame implements ActionListener{
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JLabel spelare = new JLabel("Spelare: ");
	JLabel dator = new JLabel("Datorn: ");
	JLabel spelarep = new JLabel("Spelarens poäng: 0");
	JLabel datorp = new JLabel("Datorns poäng: 0");
	JButton sten = new JButton("Sten");
	JButton sax  = new JButton("Sax");
	JButton påse = new JButton("Påse");
	JButton sten2 = new JButton("Sten");
	JButton sax2  = new JButton("Sax");
	JButton påse2 = new JButton("Påse");
	private int p1, p2; 
	
	public stensaxpåse(){
		setLayout(new GridLayout(3,2));
		add(spelare); pan.add(sten); pan.add(sax); pan.add(påse);
		add(dator); pan2.add(sten2); pan2.add(sax2); pan2.add(påse2);
		add(pan); add(pan2); add(spelarep); add(datorp);
		sten.addActionListener(this);
	    sax.addActionListener(this);
	    påse.addActionListener(this);
		setSize(350,300);
	    setVisible(true);
	}
	
	public static void main (String[] arg) {
	      stensaxpåse s = new stensaxpåse();
	      
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		sten2.setEnabled(true);
		sax2.setEnabled(true);
		påse2.setEnabled(true);
		
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
			påse2.setEnabled(false);
		}
		if(e.getSource() == sten){
			if(d==0){
				
			}else if(d==1){
				spelarep.setText("Spelarens poäng: " + String.valueOf(++p1));
			}else if(d==2){
				datorp.setText("Datorns poäng: " + String.valueOf(++p2));
			}
		}
		if(e.getSource() == sax){
			if(d==0){
				datorp.setText("Datorns poäng: " + String.valueOf(++p2));
			}else if(d==1){
				
			}else if(d==2){
				spelarep.setText("Spelarens poäng: " + String.valueOf(++p1));
			}
		}
		if(e.getSource() == påse){
			if(d==0){
				spelarep.setText("Spelarens poäng: " + String.valueOf(++p1));
			}else if(d==1){
				datorp.setText("Datorns poäng: " + String.valueOf(++p2));
			}else if(d==2){
				
			}
		}
	}
	
}
