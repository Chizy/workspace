import static javax.swing.JOptionPane.*;

public class Numbers {
	public static void main(String[] args) {
	int antaldagar;
	double dagspris;
	double totpris;
	String indata;
	indata = showInputDialog("Antal dagar?");
	antaldagar = Integer.parseInt(indata);
	indata = showInputDialog("Pris per dag?");
	dagspris = Double.parseDouble(indata);
	totpris = dagspris * antaldagar;
	showMessageDialog(null, "Totala pris: " + totpris);

	}

}
