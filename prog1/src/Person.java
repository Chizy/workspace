
public class Person {

	private int ålder;
	private String namn;
	private String adress;
	
	public Person(int å, String n, String a){
		ålder=å;
		namn=n;
		adress=a;
	}
	
	public void fyllaÅr(){
		ålder= ålder + 1;
	}
	
	public int getÅlder(){
		return ålder;
	}
	public String getNamn(){
		return namn;
	}
	public String getAdress(){
		return adress;
	}
	

}
