
public class RekursivO {

	public int l�n(int �r){
		int l�nen;
		if(�r==1){
			l�nen = 27000;
		}else{
			l�nen = (int) (400+1.04*l�n(�r-1));
		}
		
		return l�nen;
	}
}