
public class Oljazz {
	public static void main(String[] args) {
		int �r = 1990;
		double konsum = 3*Math.pow(10, 9);
		while (konsum <= Math.pow(10, 12)){
			if(konsum<=1){
				break;
			}
			konsum = konsum * 0.96;
			�r = �r + 1;
		}
		System.out.print(�r+"\n");
		System.out.print(konsum);
	}
}