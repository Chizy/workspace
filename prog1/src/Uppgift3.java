import static javax.swing.JOptionPane.*;
import java.util.Arrays;


public class Uppgift3 {
	public static void main(String[] args) {
		String indata = showInputDialog("Antal varv?"); //fr�ga hur m�nga varv "i"
		int varv = Integer.parseInt(indata); //g�r om till int
		String allaTider = ""; //deklarerar variabeln "allaTider" f�r att inte f� med "null" i utskriften
		double totala = 0;
		double[]a = new double[varv];//array i
		
		for(int k = 0; k<varv; k++){  //for(k){
			indata = showInputDialog("Tid p� "+(k+1)+" varvet?"+"\n"+"(i sekunder)"); //fr�ga varv tid
			double s = Double.parseDouble(indata); //g�r om till double
			a[k] = s; //sparat i [k]
			allaTider = allaTider+"Varv "+(k+1)+": "+s+"s"+"\n"; //spara i allTider i String
			totala = totala+s; //spara alla tider i double
		}
		Arrays.sort(a);//sortera array
		String medel = totala/varv+"s"; //r�knar ut medelv�rdet
		double snabb = a[0]; // l�ngsammaste
		double l�ngsamm = a[(varv-1)]; //snabbaste
		String skillnaden = l�ngsamm-snabb+"s"; //skillnaden mellan snabbaste och l�ngsammaste
		
		showMessageDialog(null, allaTider+"\n"+"Medel varvstid: "+medel+"\n"+"Snabbaste varvet: "+snabb+"s"+"\n"+"L�ngsammaste varvet: "+l�ngsamm+"s"+"\n"+"Skillnaden: "+skillnaden); // skriver ut resultaten
		
	}

}
