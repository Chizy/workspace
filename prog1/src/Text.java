import javax.swing.*;

public class Text {
	public static void main(String[] args) {
	String name;
	String hälsning;
	name = JOptionPane.showInputDialog("Vad heter du?");
	hälsning = "Välkommen " + name;
	JOptionPane.showMessageDialog(null, hälsning);
	
	}

}
