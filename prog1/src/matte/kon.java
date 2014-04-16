package matte;

import static javax.swing.JOptionPane.*;

public class kon {
	public static void main(String[] args) {
		double radie;
		double höjd;
		double volym;
		double area;
		double pi = 3.14;
		String indata;
		indata = showInputDialog("Radie?");
		radie = Double.parseDouble(indata);
		indata = showInputDialog("Höjden?");
		höjd = Double.parseDouble(indata);
		volym = (radie*radie*pi*höjd)/3;
		area = (radie*radie*pi);
		showMessageDialog(null, "Volymen: " + volym + "  Bottenarean: " + area);

	}

}