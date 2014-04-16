
public class RekursivO {

	public int lön(int år){
		int lönen;
		if(år==1){
			lönen = 27000;
		}else{
			lönen = (int) (400+1.04*lön(år-1));
		}
		
		return lönen;
	}
}