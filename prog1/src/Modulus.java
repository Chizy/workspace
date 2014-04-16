import javax.swing.JOptionPane;


public class Modulus {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Personnummer?");
		String s2 = s1.substring(13);
		int i = Integer.parseInt(s2);
		if(i % 2==0){
			System.out.print("Kvinna!");
		}else{
			System.out.print("Mann!");
		}
	}
}
