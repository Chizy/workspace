import static javax.swing.JOptionPane.showInputDialog;

import java.util.LinkedList;


public class InsertAlg2 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<10;i++){
			String indata = showInputDialog("Nummer? "+(i+1)+" av 10st");
			int k = Integer.parseInt(indata);
			if(i==0){
				ll.add(i, k);
			}
			for(int b=0;b<i;b++){
				if(k<=ll.get(b)){
					ll.add(b, k);
					break;
				}
				if(b==(i-1)){
					ll.addLast(k);
				}
			}
		}
		System.out.print(ll.toString());
	}

}
