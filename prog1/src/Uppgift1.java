import static javax.swing.JOptionPane.*;



public class Uppgift1 {
	public static void main(String[] args) {
		String indata = showInputDialog("Pris f�re moms?"); //matar in priset
		double prisF�re = Integer.parseInt(indata); //g�r om string till int, f�r att kunna r�kna med det
		double moms = prisF�re*0.25; //ber�knar 25% moms
		double totPris = prisF�re+moms; //ber�knar totala priset
		
		showMessageDialog(null, "Pris f�re moms: "+prisF�re+":-"+"\n"+"Moms: "+moms+":-"+"\n"+"Pris med moms: "+totPris+":-");
		//Utskrift i dialo ruta
	
	}
}
