import static javax.swing.JOptionPane.*;
import java.util.Arrays;


public class Uppgift3 {
	public static void main(String[] args) {
		String indata = showInputDialog("Antal varv?"); //fråga hur många varv "i"
		int varv = Integer.parseInt(indata); //gör om till int
		String allaTider = ""; //deklarerar variabeln "allaTider" för att inte få med "null" i utskriften
		double totala = 0;
		double[]a = new double[varv];//array i
		
		for(int k = 0; k<varv; k++){  //for(k){
			indata = showInputDialog("Tid på "+(k+1)+" varvet?"+"\n"+"(i sekunder)"); //fråga varv tid
			double s = Double.parseDouble(indata); //gör om till double
			a[k] = s; //sparat i [k]
			allaTider = allaTider+"Varv "+(k+1)+": "+s+"s"+"\n"; //spara i allTider i String
			totala = totala+s; //spara alla tider i double
		}
		Arrays.sort(a);//sortera array
		String medel = totala/varv+"s"; //räknar ut medelvärdet
		double snabb = a[0]; // långsammaste
		double långsamm = a[(varv-1)]; //snabbaste
		String skillnaden = långsamm-snabb+"s"; //skillnaden mellan snabbaste och långsammaste
		
		showMessageDialog(null, allaTider+"\n"+"Medel varvstid: "+medel+"\n"+"Snabbaste varvet: "+snabb+"s"+"\n"+"Långsammaste varvet: "+långsamm+"s"+"\n"+"Skillnaden: "+skillnaden); // skriver ut resultaten
		
	}

}
