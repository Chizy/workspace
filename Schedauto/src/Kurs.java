import java.util.ArrayList;

public class Kurs {
	private String kursNamn;
	private L�rare l�rare;
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private ArrayList<Lektion> lektioner = new ArrayList<Lektion>();
	private int passPerV;
	
	
	public String getKursNamn() {
		return kursNamn;
	}
	public String getL�rareInNamn() {
		return l�rare.getInitialer();
	}
}
