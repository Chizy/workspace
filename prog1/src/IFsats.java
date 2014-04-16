import javax.swing.*;

public class IFsats {
	public static void main(String[] args) {
		String indata;
		indata = JOptionPane.showInputDialog("Antal?");
		int antal = Integer.parseInt(indata);
		indata = JOptionPane.showInputDialog("Pris per styck?");
		double perSt = Double.parseDouble(indata);
		int svar = JOptionPane.showConfirmDialog(null, "Är du medlem?");
		double pris = perSt * antal;
		if (pris >= 1000 && pris < 2000) {
			pris = pris * 0.90;
		}else if (pris >= 2000 && pris < 3000) {
			pris = pris * 0.80;
		}else if (pris >= 3000) {
			pris = pris * 0.70;
		}else {
			JOptionPane.showMessageDialog(null, "Ingen rabatt!!!");
		}
		if (svar == 0) {
			pris = pris * 0.95;
		}
	JOptionPane.showMessageDialog(null, "Totalt pris: " + pris);
}
}