import java.util.ArrayList;

public class Kurs {
	private String kursNamn;
	private Lärare lärare;
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private ArrayList<Lektion> lektioner = new ArrayList<Lektion>();
	private int passPerV;
	
	
	public String getKursNamn() {
		return kursNamn;
	}
	public String getLärareInNamn() {
		return lärare.getInitialer();
	}
}
