import javax.swing.JOptionPane;


public class Bil�gare extends Person{
	
	private Bil bil;

	public void s�lj(){
		
	}
	
	public void k�p(Bil b){
		bil = b;
		b.k�pt(this);
		
	}

	public static void main (String arg[]){
		namn = JOptionPane.showInputDialog("Personens namn?");
		Bil�gare bi1 = new Bil�gare();
		Bil b1 = new Bil();
		bi1.k�p(b1);
		
	}
}
