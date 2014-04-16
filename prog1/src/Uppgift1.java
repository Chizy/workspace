import static javax.swing.JOptionPane.*;



public class Uppgift1 {
	public static void main(String[] args) {
		String indata = showInputDialog("Pris före moms?"); //matar in priset
		double prisFöre = Integer.parseInt(indata); //gör om string till int, för att kunna räkna med det
		double moms = prisFöre*0.25; //beräknar 25% moms
		double totPris = prisFöre+moms; //beräknar totala priset
		
		showMessageDialog(null, "Pris före moms: "+prisFöre+":-"+"\n"+"Moms: "+moms+":-"+"\n"+"Pris med moms: "+totPris+":-");
		//Utskrift i dialo ruta
	
	}
}
