
public class Uppgift2object {
	private String talen = ""; //deklarerar variabeln "talen" f�r att inte f� med "null" i utskriften
	private int k = 1; //f�r att r�kna ordningen
	
	public String skrivTalf�ljd(int start2, int stop2){ //metodhuvudet med String rutur-typ och tv� int inmatningar
		
		for(int i=start2; i<=stop2; i++){ //loop fr�n startv�rdet till slut v�rdet
			
			if(i % 2==0){ //x modulus 2 �r 0 om x �r j�mnt
				talen = talen+"Plats "+k+": "+i+"\n"; //sparar det i variabeln "talen"
				k++; //plussar p� k med 1
			}
		}
		
		
		return talen; // returnerar utskriften
	}
}