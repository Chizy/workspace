import javax.swing.*;

public class WHILEsats {
	public static void main(String[] args) {
		while (true){
			String indata = JOptionPane.showInputDialog("�nskat belopp");
			if (indata == null)
				break;
			double �nskatbelopp = Double.parseDouble(indata);
			int antaldagar=1;
			double dagsl�n = 0.01;
			double totalbelopp = 0.01;
			while (totalbelopp < �nskatbelopp) {
				antaldagar = antaldagar +1;
				dagsl�n = dagsl�n *2;
				totalbelopp = totalbelopp + dagsl�n;
			}
		
		JOptionPane.showMessageDialog(null, "Du blir rik om " + antaldagar + " dagar.");
		}
	}

}