import javax.swing.JOptionPane;


public class MirrorWord {
	public static void main(String[] args) {
		
		String s1= JOptionPane.showInputDialog("Ord?");
		String bak = s1+"\n";
		int i=s1.length()-1;
		while(i>=0){
			bak = bak + s1.charAt(i);
		i--;
		}
		System.out.print(bak);
	}
}

