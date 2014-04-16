package Övningett;

import static javax.swing.JOptionPane.*;

public class uppfyra {
	public static void main(String[] args) {
	double radie;
	double volym;
	double area;
	double pi = 3.14;
	String indata;
	indata = showInputDialog("Radie?");
	radie = Double.parseDouble(indata);
	volym = (radie*radie*radie*4*pi)/3;
	area = (radie*radie*4*pi);
	showMessageDialog(null, "Volym: " + volym + "  Och area:  " + area);

	}

}

