import java.util.*;

public class Klocka {

	public static void main(String[] args) {
		Tidpunkt tp = new Tidpunkt();
		Calendar c = Calendar.getInstance();
		
		tp.s�tt(c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
		
		System.out.print("Klockan �r "+ tp.toString());
		
	}

}
