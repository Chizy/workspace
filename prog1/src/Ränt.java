import javax.swing.*;

public class R�nt {
	public static void main(String[] args) {
		String blash = "Du f�r: \n";
		String indata;
		double r=1.05;
		indata = JOptionPane.showInputDialog("Hur mycket s�tter du in?");
		double summa = Double.parseDouble(indata);
		indata = JOptionPane.showInputDialog("�r?");
		int � = Integer.parseInt(indata);
		for (int i=0; i<=�; i++){
			blash = blash + "�r "+ i + ": " + summa  + "\n";
			summa= summa * r;
			
		}
		JOptionPane.showMessageDialog(null, blash);

	}

}
