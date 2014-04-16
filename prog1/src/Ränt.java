import javax.swing.*;

public class Ränt {
	public static void main(String[] args) {
		String blash = "Du får: \n";
		String indata;
		double r=1.05;
		indata = JOptionPane.showInputDialog("Hur mycket sätter du in?");
		double summa = Double.parseDouble(indata);
		indata = JOptionPane.showInputDialog("År?");
		int å = Integer.parseInt(indata);
		for (int i=0; i<=å; i++){
			blash = blash + "År "+ i + ": " + summa  + "\n";
			summa= summa * r;
			
		}
		JOptionPane.showMessageDialog(null, blash);

	}

}
