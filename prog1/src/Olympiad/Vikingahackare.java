package Olympiad;

import java.io.*;

public class Vikingahackare {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String input = b.readLine();
		int längd = Integer.parseInt(input);
		int k = 0;
		int k2 = 2;
		String s1 = "";
		String s2 = "";
		String[] a = new String[längd];
		for(int h=0;h<längd;h++){
			a[h] = b.readLine();
		}
		String kod = b.readLine();
		
		for(int i=0;i<(kod.length()/4);i++){
			for(int i2=0;i2<längd;i2++){
				s1 = kod.substring(k, k+4);
				s2 = a[i2].substring(k2, k2+4);
				if(s1.equalsIgnoreCase(s2)){
					System.out.print(a[i2].substring(0, 1));
					break;
				}else if(i2==(längd-1)){
					System.out.print("?");
				}
			}
		k=k+4;
		}
		
	}

}
