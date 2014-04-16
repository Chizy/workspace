import java.util.Arrays;

import javax.swing.JOptionPane;


public class Array {
	public static void main(String[] args) {
		int a1[] = new int[5];
		for(int i=0; i<a1.length;i++){
			String w = JOptionPane.showInputDialog("På possision: "+(i+1));
			int k = Integer.parseInt(w);
			a1[i]=k;
		}
		System.out.print(Arrays.toString(a1));
	}

}
