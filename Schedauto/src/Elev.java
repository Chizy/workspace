import java.util.ArrayList;


public class Elev{
	private String klass;
	private String namn;
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();
	private Schema sch;

	public Elev(Schema s){
		sch = s;
	}

	public String getNamn() {
		return namn;
	}

	public void setName(String n) {
		namn = n;
	}

	public void setKlass(String k) {
		klass = k;
	}

	public void addKurs(Kurs kur) {
		kurs.add(kur);
	}
}
