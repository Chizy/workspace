import java.awt.Color;
import java.util.ArrayList;

public class Kurs {
	private String kursNamn;
	private Lärare lärare;
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private int passPerV;
	private Color col;
	
	
	public String getKursNamn() {
		return kursNamn;
	}
	public String getLärareInNamn() {
		return lärare.getInitialer();
	}
	public int getPassPerV() {
		return passPerV;
	}
	public Color getColor() {
		return col;
	}
	public Lärare getLärare() {
		return lärare;
	}
	public ArrayList<Elev> getElevList() {
		return elev;
	}
	public void setKursNamn(String s) {
		kursNamn = s;
	}
	public void setLärare(Lärare l) {
		lärare = l;
	}
	public void addElev(Elev e) {
		elev.add(e);
	}
	public void setPassPerV(int i) {
		passPerV = i;
	}
	public void setColor(Color c) {
		col = c;
	}
	
}