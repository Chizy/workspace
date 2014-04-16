import java.util.Arrays;


public class Sökning {
	private int[]a = {1,3,4,5,7,9,12,32,3,92};
	
	public int Sök(int s) {
		for(int i = 0; i<=a.length; i++){
			int t = a[i];
			if(t==s){
				s = i+1;
				break;
			}
		}
	return s;
	}

	public void binSök(int s){
		Arrays.sort(a);
		int start = 0;
		int slut = a.length;
		int mitt = 0;
		int mitt2 = 0;
		for(int i = 0; i<=a.length; i++){
			mitt = (int)(start+slut)/2;
			mitt2 = a[mitt];
			if(mitt2==s){
				System.out.print("På plats: "+ mitt);
				break;
			}
			if(mitt2<s){
				start=mitt;
			}
			if(mitt2>s){
				slut=mitt;
			}
		}

	}
	
}
