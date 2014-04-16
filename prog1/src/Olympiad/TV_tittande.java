
package Olympiad;

import java.io.*;

public class TV_tittande {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String input = b.readLine();
		int kanaler = Integer.parseInt(input);
		int k = 0;
		int minnu = 0;
		int tim = 0;
		int min = 0;
		int compare = 0;
		int tim2 = 0;
		int min2 = 0;
		int compare2 = 0;
		int tima = 0;
		int mina = 0;
		int tim2a = 0;
		int min2a = 0;
		int[]minuter = new int[kanaler];
		String[]reklam = new String[kanaler];
		int[]antReklam = new int[kanaler];
		antReklam[0] = 1;
		for(int h=0;h<kanaler;h++){
			minuter[h] = 0;
			input = b.readLine();
			antReklam[h] = Integer.parseInt(input.substring(0, 1));
			if(antReklam[h]>0){
				reklam[h] = input.substring(1);
			}
		}
		
		while(minnu<1440){
			for(int i=0;i<kanaler;i++){
				if(minnu == 1440){
					break;
				}
				if(antReklam[i]==0){
					minuter[i]=minuter[i]+(1440-minnu);
					break;
				}
				for(int i2=0;i2<antReklam[i];i2++){
					if(minnu == 1440){
						break;
					}
					input = reklam[i].substring(k+1, k+2);
					tim = Integer.parseInt(input);
					tim = tim*10;
					tim = tim*60;
					input = reklam[i].substring(k+2, k+3);
					tima = Integer.parseInt(input);
					tima = tima*60;
					tim = tim+tima;
					
					input = reklam[i].substring(k+4, k+5);
					min = Integer.parseInt(input);
					min = min*10;
					input = reklam[i].substring(k+5, k+6);
					mina = Integer.parseInt(input);
					min = min+mina;
					
					compare = min+tim;
					
					input = reklam[i].substring(k+7, k+8);
					tim2 = Integer.parseInt(input);
					tim2 = tim2*10;
					tim2 = tim2*60;
					input = reklam[i].substring(k+8, k+9);
					tim2a = Integer.parseInt(input);
					tim2a = tim2a*60;
					tim2 = tim2+tim2a;
					
					input = reklam[i].substring(k+10, k+11);
					min2 = Integer.parseInt(input);
					min2 = min2*10;
					input = reklam[i].substring(k+11, k+12);
					min2a = Integer.parseInt(input);
					min2 = min2+min2a;
					
					compare2 = min2+tim2;
					
					if(minnu >= compare && minnu <=compare2){
						minnu++;
						if(minnu == 1440){
							break;
						}
						break;
					}
					if(minnu < compare){
						minuter[i]=minuter[i]+(compare-minnu);
						minnu = compare;
						if(minnu == 1440){
							break;
						}
						minnu++;
						if(minnu == 1440){
							break;
						}
						break;
					}
					k=k+12;
					if((i2+1)==antReklam[i] && minnu > compare2){
						minuter[i]=minuter[i]+(1440-minnu);
						minnu = 1440;
					}
				}
				if(minnu == 1440){
					break;
				}
				k=0;
			}
		}
		for(int slut=0;slut<kanaler;slut++){
			System.out.println(minuter[slut]);
		}
	}
}
