package �vningett;

import javax.swing.*;

public class uppsju {
	public static void main(String[] args) {
		String indata;
		double sv�rgrad=-100;
		while (sv�rgrad < 1 || sv�rgrad > 5){
			if (sv�rgrad != -100){
				JOptionPane.showMessageDialog(null, "....skriv en giltigt sv�righetsgrad.");	
			}
			indata = JOptionPane.showInputDialog("Sv�righetsgrad? Fr�n 1-5");
			sv�rgrad = Double.parseDouble(indata);
		}
		int domare=1;
		double slutsumma;
		double summa=0;
		double Pmin=10;
		double Pmax=0;
		double pong;
		
		while (domare <=7){
			indata = JOptionPane.showInputDialog("Po�ng? Fr�n 0-10");
			pong = Double.parseDouble(indata);
			while (pong < 0 || pong > 10){
				JOptionPane.showMessageDialog(null, "....skriv ett giltigt po�ng.");	
				
				indata = JOptionPane.showInputDialog("Po�ng? Fr�n 0-10");
				pong = Double.parseDouble(indata);
			}
			if (Pmin > pong){
				Pmin= pong;
			}
			if (Pmax < pong){
				Pmax= pong;
			}
			summa= summa + pong;
			domare++;
			
		}
		
		summa= summa - Pmin - Pmax;
		slutsumma= (summa/5)*sv�rgrad;
	
	JOptionPane.showMessageDialog(null, slutsumma + " Po�ng");
	}
	
}
