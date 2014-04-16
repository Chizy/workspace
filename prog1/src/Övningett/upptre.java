package Övningett;

import static javax.swing.JOptionPane.*;

public class upptre {
	public static void main(String[] args) {
		double milegallon;
		double milliter;
		String indata;
		indata = showInputDialog("Mile/Gallon?");
		milegallon = Double.parseDouble(indata);
		milliter = (0.1609/3.785)*milegallon;
		showMessageDialog(null, "Mil/Liter: "+ milliter);
	}

}
