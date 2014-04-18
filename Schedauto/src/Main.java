import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;



public class Main extends JFrame implements ActionListener{
	private ArrayList<Schema> schema = new ArrayList<Schema>();
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private ArrayList<L�rare> l�rare = new ArrayList<L�rare>();
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();
	private Schema sch = new Schema();
	private Elev ele = new Elev(sch);
	private L�rare l�r = new L�rare(sch);
	private Kurs kur = new Kurs();
	private JTabbedPane tPane = new JTabbedPane();
	private JMenuBar bar = new JMenuBar();
	private JMenu men1 = new JMenu("File");
	private JMenuItem[] Ny = new JMenuItem[4];
	private String[] s ={"Generara","Ny Elev","Ny L�rare","Ny Kurs"};
	
	
	public Main(){
		setTitle("Schedauto");
		bar.add(men1);
		for (int i=0; i<Ny.length; i++) { 
		      Ny[i] = new JMenuItem();
		      Ny[i].setText(s[i]);
		      Ny[i].addActionListener(this); 
		      men1.add(Ny[i]);
		}
	    bar.setPreferredSize(new Dimension(1000,22));
	    tPane.addTab(ele.getNamn(),sch);
	    add(tPane, BorderLayout.CENTER);
		add(bar, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] arg) {
		Main s = new Main();
	  } 
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Ny[0]){
			generare();
		}
		else if (e.getSource() == Ny[1]){ 
			sch = new Schema();
			ele = new Elev(sch);
			schema.add(sch);
			elev.add(ele);
			ele.setName("Axel �hlund");
			ele.setKlass("3NA");
			//for(){
			//ele.addKurs(kur);
		}
		else if (e.getSource() == Ny[2]){ 
			sch = new Schema();
			l�r = new L�rare(sch);
			schema.add(sch);
			l�rare.add(l�r);
			l�r.setName("Malena Mekinen");
			l�r.setInitialer("MM");
			//for(){
			//l�r.addKurs(kur);
			
		}
		else if (e.getSource() == Ny[3]){
			kur = new Kurs();
			kurs.add(kur);
			
			
		} 
	  
	}

	private void generare() {
		
	}
}

