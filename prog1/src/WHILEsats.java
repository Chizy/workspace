import javax.swing.*;

public class WHILEsats {
	public static void main(String[] args) {
		while (true){
			String indata = JOptionPane.showInputDialog("Önskat belopp");
			if (indata == null)
				break;
			double önskatbelopp = Double.parseDouble(indata);
			int antaldagar=1;
			double dagslön = 0.01;
			double totalbelopp = 0.01;
			while (totalbelopp < önskatbelopp) {
				antaldagar = antaldagar +1;
				dagslön = dagslön *2;
				totalbelopp = totalbelopp + dagslön;
			}
		
		JOptionPane.showMessageDialog(null, "Du blir rik om " + antaldagar + " dagar.");
		}
	}

}
