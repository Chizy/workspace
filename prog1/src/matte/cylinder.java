package matte;

import static javax.swing.JOptionPane.*;

public class cylinder {
	public static void main(String[] args) {
		double radie;
		double h�jd;
		double volym;
		double area;
		double pi = 3.14;
		String indata;
		indata = showInputDialog("Radie?");
		radie = Double.parseDouble(indata);
		indata = showInputDialog("H�jden?");
		h�jd = Double.parseDouble(indata);
		volym = (radie*radie*pi*h�jd);
		area = (radie*radie*pi);
		showMessageDialog(null, "Volymen: " + volym + "  Bottenarean: " + area);

	}

}