import static javax.swing.JOptionPane.*;



public class Uppgift2 {
	public static void main(String[] args) {
		Uppgift2object s1 = new Uppgift2object();//skapar objektet
		String indata = showInputDialog("Start talet?"); //fr�gar efter start talet
		int start = Integer.parseInt(indata); //omvandlar till int
		indata = showInputDialog("Slut talet?"); //fr�gar efter slut talet
		int stop = Integer.parseInt(indata); //omvandlar till int
		String talf�ljd = s1.skrivTalf�ljd(start, stop); //sickar med start talet och stop talet, samt f�r tillbaka talf�ljden
		
		showMessageDialog(null, talf�ljd); //skriver ut talf�ljden
		
	}

}
