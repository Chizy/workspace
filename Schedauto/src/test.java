import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;



public class test extends JFrame implements ActionListener{
	private ArrayList<Schema> schema = new ArrayList<Schema>();
	private Schema sch = new Schema();
	private JTabbedPane tPane = new JTabbedPane();
	private JMenuBar bar = new JMenuBar();
	private JMenu men1 = new JMenu("File");
	private JMenuItem[] Ny = new JMenuItem[4];
	private String[] s ={"Generara","Ny Elev","Ny Lärare","Ny Kurs"};
	private JLabel l1 = new JLabel();  
	private JLabel l2 = new JLabel();
	
	public test(){
		setTitle("Schedauto");
		bar.add(men1);
		for (int i=0; i<Ny.length; i++) { 
		      Ny[i] = new JMenuItem(); 
		      Ny[i].setText(s[i]); 
		      Ny[i].addActionListener(this); 
		      men1.add(Ny[i]); 
		}
	    l1.setPreferredSize(new Dimension(60,600));
	    l2.setPreferredSize(new Dimension(60,600));
	    bar.setPreferredSize(new Dimension(1000,22));
	    l1.setFont(new Font("SansSerif", Font.BOLD, 24)); 
	    l2.setFont(new Font("SansSerif", Font.BOLD, 24));
	    tPane.addTab("Start", sch);
	    add(tPane, BorderLayout.CENTER);
		add(l1, BorderLayout.WEST);
		add(l2, BorderLayout.EAST); 
		add(bar, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] arg) {
		test s = new test();
	  } 
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Ny[0]){
			
		}
		else if (e.getSource() == Ny[1]){ 
			schema.add(new Schema());
		}
		else if (e.getSource() == Ny[2]){ 
			schema.add(new Schema());
		}
		else if (e.getSource() == Ny[3]){
		    
		} 
	  
	}

}