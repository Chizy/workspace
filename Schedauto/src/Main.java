import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Main extends JFrame implements ActionListener{
	private ArrayList<Schema> schema = new ArrayList<Schema>();
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private ArrayList<Lärare> lärare = new ArrayList<Lärare>();
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();
	private ArrayList<Sal> sal = new ArrayList<Sal>();  // akfjsdbbfkjadsbkjaffakbdjakfdsjbafbkjafkbjafkjbaks
	private Schema sch = new Schema();
	private Elev ele = new Elev(sch);
	private Lärare lär = new Lärare(sch);
	private Kurs kur = new Kurs();
	private Sal sa = new Sal();
	private JTabbedPane tPane = new JTabbedPane();
	private JMenuBar bar = new JMenuBar();
	private JMenu men1 = new JMenu("File");
	private JMenuItem[] Ny = new JMenuItem[6];
	private String[] s ={"Generara","Ny Elev","Ny Lärare","Ny Sal","Ny Kurs","Öppna alla Elev"};
	
	
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
	    tPane.addTab("Start",sch);
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
			generera();
		}
		else if (e.getSource() == Ny[1]){
			sch = new Schema();
			ele = new Elev(sch);
			schema.add(sch);
			elev.add(ele);
			ele.setName("Axel Åhlund");
			ele.setKlass("3NA");
		}
		else if (e.getSource() == Ny[2]){
			sch = new Schema();
			lär = new Lärare(sch);
			schema.add(sch);
			lärare.add(lär);
			lär.setName("Malena Mekinen");
			lär.setInitialer("MM");
		}
		else if (e.getSource() == Ny[3]){
			sa = new Sal();
			sal.add(sa);
			sa.setNamn("131");
		}
		else if (e.getSource() == Ny[4]){
			kur = new Kurs();
			kurs.add(kur);
			kur.setKursNamn("SV");
			kur.setPassPerV(2);
			kur.setLärare(lär);
			kur.addElev(ele);
			kur.setColor(Color.green);
			kur = new Kurs();
			kurs.add(kur);
			kur.setKursNamn("ENG");
			kur.setPassPerV(3);
			kur.setLärare(lär);
			kur.addElev(ele);
			kur.setColor(Color.blue);
			kur = new Kurs();
			kurs.add(kur);
			kur.setKursNamn("HIS");
			kur.setPassPerV(1);
			kur.setLärare(lär);
			kur.addElev(ele);
			kur.setColor(Color.orange);
			kur = new Kurs();
			kurs.add(kur);
			kur.setKursNamn("REL");
			kur.setPassPerV(2);
			kur.setLärare(lär);
			kur.addElev(ele);
			kur.setColor(Color.red);
			kur = new Kurs();
			kurs.add(kur);
			kur.setKursNamn("PROG");
			kur.setPassPerV(3);
			kur.setLärare(lär);
			kur.addElev(ele);
			kur.setColor(Color.yellow);
		}
		else if (e.getSource() == Ny[5]){
			for(int i = 0;i<elev.size();i++){
				tPane.addTab(elev.get(i).getNamn(),elev.get(i).getSchema());
			}
		}
	}

	private void generera() {
		
		for(int i=0;i<25;i++){
			
			for(int i2=0;i2<kurs.size();i2++){
				
				if(kurs.get(i2).getPassPerV()>i){
					int p = -1;
					int n = 0;
					int s = 0;//for(s)
					for(int i3=0;i3<kurs.get(i2).getElevList().size();i3++){
						if(p==-1){
							sch = kurs.get(i2).getElevList().get(0).getSchema();
							p = sch.getFriPlats(n);
						}
						sch = kurs.get(i2).getElevList().get(i3).getSchema();
						if(sch.getPlats(p)==1){
							i3=-1;
							n=p+1;
							p=-1;
						}
					}
					for(int i4=0;i4<kurs.get(i2).getElevList().size();i4++){
						if(i4==0){
							sch = kurs.get(i2).getLärare().getSchema();
							sch.setKursPlats(p,kurs.get(i2));
							sch.setSalPlats(p,sal.get(s)); 
							sch.setLektion(p);
						}
						sch = kurs.get(i2).getElevList().get(i4).getSchema();
						sch.setKursPlats(p,kurs.get(i2));
						sch.setSalPlats(p,sal.get(s)); 
						sch.setLektion(p);
					}
				}
			}
		}
	}
}