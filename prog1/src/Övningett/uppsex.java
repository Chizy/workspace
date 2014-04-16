package Övningett;

import static javax.swing.JOptionPane.*;

public class uppsex {
	public static void main(String[] args) {
	double radie = -100;
	double volym;
	double area;
	double pi = 3.14;
	String indata;
	while (radie <= 0){
		if (radie != -100){
			showMessageDialog(null, "....skriv ett giltigt nummer.");	
		}
		indata = showInputDialog("Radie?");
		radie = Double.parseDouble(indata);
	}
	volym = (radie*radie*radie*4*pi)/3;
	area = (radie*radie*4*pi);
	showMessageDialog(null, "Volym: " + volym + "  Och area:  " + area);
	
	}

}
