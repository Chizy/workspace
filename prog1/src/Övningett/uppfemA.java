package �vningett;

import javax.swing.*;

public class uppfemA {
	public static void main(String[] args) {
		String indata;
		indata = JOptionPane.showInputDialog("Vilket �r �r det nu igen?");
		int nu�r = Integer.parseInt(indata);
		indata = JOptionPane.showInputDialog("Vad �r det f�r �rsmodell p� k�rran?");
		int �rsmodell = Integer.parseInt(indata);
		double skillnad = nu�r - �rsmodell;
		if (skillnad <= 5){
			JOptionPane.showMessageDialog(null, "V�lj en helf�rs�kring.");
		}else if (skillnad > 5 && skillnad < 25){
			JOptionPane.showMessageDialog(null, "V�lj en halvf�rs�kring.");
		}else {
			JOptionPane.showMessageDialog(null, "V�lj en veteranbilsf�rs�kring.");
		}
	}

}
