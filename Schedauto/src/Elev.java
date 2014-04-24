

public class Elev{
	private String klass;
	private String namn;
	private Schema sch;

	public Elev(Schema s){
		sch = s;
	}

	public String getNamn() {
		return namn;
	}
	
	public Schema getSchema() {
		return sch;
	}

	public void setName(String n) {
		namn = n;
	}

	public void setKlass(String k) {
		klass = k;
	}
}
