import java.util.ArrayList;


public class Lärare{
	private String initial;
	private String namn;
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();
	private Schema sch;

	public Lärare(Schema s){
		sch = s;
	}
	
	public String getInitialer() {
		return initial;
	}

	public void setName(String n) {
		namn = n;
	}
	public void setInitialer(String i) {
		initial = i;
	}

	public String getName() {
		return namn;
	}
	public void addKurs(Kurs kur) {
		kurs.add(kur);
	}

	public Schema getSchema() {
		return sch;
	}
}
