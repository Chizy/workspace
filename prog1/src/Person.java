
public class Person {

	private int �lder;
	private String namn;
	private String adress;
	
	public Person(int �, String n, String a){
		�lder=�;
		namn=n;
		adress=a;
	}
	
	public void fylla�r(){
		�lder= �lder + 1;
	}
	
	public int get�lder(){
		return �lder;
	}
	public String getNamn(){
		return namn;
	}
	public String getAdress(){
		return adress;
	}
	

}
