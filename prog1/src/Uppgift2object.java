
public class Uppgift2object {
	private String talen = ""; //deklarerar variabeln "talen" för att inte få med "null" i utskriften
	private int k = 1; //för att räkna ordningen
	
	public String skrivTalföljd(int start2, int stop2){ //metodhuvudet med String rutur-typ och två int inmatningar
		
		for(int i=start2; i<=stop2; i++){ //loop från startvärdet till slut värdet
			
			if(i % 2==0){ //x modulus 2 är 0 om x är jämnt
				talen = talen+"Plats "+k+": "+i+"\n"; //sparar det i variabeln "talen"
				k++; //plussar på k med 1
			}
		}
		
		
		return talen; // returnerar utskriften
	}
}