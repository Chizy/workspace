import javax.swing.JOptionPane;


public class Bil {
	private String reg;
	private String m�rke;
	private Bil�gare �gare;
	
	public Bil(){
		reg = JOptionPane.showInputDialog("Registrerings nr.?");
		m�rke = JOptionPane.showInputDialog("M�rke?");
		
	}

	public void s�ljd(){
		
	}
	
	public void k�pt(Bil�gare b){
		�gare = b;
		
	}



}
