import java.util.ArrayList;


public class L�rare{
	private String initial;
	private String namn;
	private Schema sch;

	public L�rare(Schema s){
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

	public Schema getSchema() {
		return sch;
	}
}
