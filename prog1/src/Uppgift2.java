import static javax.swing.JOptionPane.*;



public class Uppgift2 {
	public static void main(String[] args) {
		Uppgift2object s1 = new Uppgift2object();//skapar objektet
		String indata = showInputDialog("Start talet?"); //frågar efter start talet
		int start = Integer.parseInt(indata); //omvandlar till int
		indata = showInputDialog("Slut talet?"); //frågar efter slut talet
		int stop = Integer.parseInt(indata); //omvandlar till int
		String talföljd = s1.skrivTalföljd(start, stop); //sickar med start talet och stop talet, samt får tillbaka talföljden
		
		showMessageDialog(null, talföljd); //skriver ut talföljden
		
	}

}
