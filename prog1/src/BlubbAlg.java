import static javax.swing.JOptionPane.*;

import java.util.Arrays;


public class BlubbAlg {
	public static void main(String[] args) {
		
		String indata = showInputDialog("L�ngd p� lista?");
		int m�ngd = Integer.parseInt(indata);
		int[]a=new int[m�ngd];
		int k=(a.length+1);
		for(int h=0;h<m�ngd;h++){
			String indata2 = showInputDialog("Nummer p� plats: "+h+"?");
			a[h] = Integer.parseInt(indata2);
		}
		
			for(int i=0;i<=k;i++){
				for(int i2=0;i2<(a.length-1);i2++){
					if(a[i2]>a[(i2+1)]){
						int b=a[(i2+1)];
						a[(i2+1)]=a[i2];
						a[i2]=b;
					}
				}
			k=k-1;
			}
		System.out.print(Arrays.toString(a));
	}

}
