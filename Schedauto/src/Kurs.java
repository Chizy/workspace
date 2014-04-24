import java.awt.Color;
import java.util.ArrayList;

public class Kurs {
	private String kursNamn;
	private L�rare l�rare;
	private ArrayList<Elev> elev = new ArrayList<Elev>();
	private int passPerV;
	private Color col;
	
	
	public String getKursNamn() {
		return kursNamn;
	}
	public String getL�rareInNamn() {
		return l�rare.getInitialer();
	}
	public int getPassPerV() {
		return passPerV;
	}
	public Color getColor() {
		return col;
	}
	public L�rare getL�rare() {
		return l�rare;
	}
	public ArrayList<Elev> getElevList() {
		return elev;
	}
	public void setKursNamn(String s) {
		kursNamn = s;
	}
	public void setL�rare(L�rare l) {
		l�rare = l;
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