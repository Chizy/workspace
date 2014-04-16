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
	private Schema sch = new Schema();
	private JTabbedPane tPane = new JTabbedPane();
	private JMenuBar bar = new JMenuBar();
	private JMenu men1 = new JMenu("File");
	private JMenuItem[] Ny = new JMenuItem[4];
	private String[] s ={"Generara","Ny Elev","Ny Lärare","Ny Kurs"};
	
	
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
	    tPane.addTab("Start", sch);
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
			
		}
		else if (e.getSource() == Ny[1]){ 
			schema.add(new Schema());
			elev.add(new Elev());
		}
		else if (e.getSource() == Ny[2]){ 
			schema.add(new Schema());
			lärare.add(new Lärare());
		}
		else if (e.getSource() == Ny[3]){
			kurs.add(new Kurs());
		} 
	  
	}
}

