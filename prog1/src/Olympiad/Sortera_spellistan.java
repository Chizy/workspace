package Olympiad;

import java.io.*;

public class Sortera_spellistan {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String input = b.readLine();
		int mängd = Integer.parseInt(input);
		int[]a=new int[mängd];
		int k=(a.length+1);
		int antal = 0;
		for(int h=0;h<mängd;h++){
			input = b.readLine();
			a[h] = Integer.parseInt(input);
		}
		
		for(int i=0;i<=k;i++){
			for(int i2=1;i2<(k-1);i2++){
				if(a[i2-1]>a[i2]){
					int b1=a[i2];
					a[i2]=a[i2-1];
					a[i2-1]=b1;
					antal++;
				}
			}
	}
		System.out.println(antal);
}
}
