package matte;

import static javax.swing.JOptionPane.*;

public class cirkel {
	public static void main(String[] args) {
		double radie;
		double omkrets;
		double area;
		double pi = 3.14;
		String indata;
		indata = showInputDialog("Radie?");
		radie = Double.parseDouble(indata);
		omkrets = (radie*2*pi);
		area = (radie*radie*pi);
		showMessageDialog(null, "Area: "+ area +" Omkrets: "+ omkrets);

	}

}
