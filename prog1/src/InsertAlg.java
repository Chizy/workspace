import static javax.swing.JOptionPane.showInputDialog;

import java.util.LinkedList;


public class InsertAlg {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<10;i++){
			String indata = showInputDialog("Nummer? "+(i+1)+" av 10st");
			int k = Integer.parseInt(indata);
			ll.add(i, k);
		}
		
		for(int b=0;b<10;b++){
			for(int c=0;c<b;c++){
				if(ll.get(b)<ll.get(c)){
					int s=ll.get(b);
					ll.remove(b);
					ll.add(c, s);
				}
			}
		}
		
		System.out.print(ll.toString());
		
	}

}
