
public class Arraytest2 {
	
	int[]a = {1,2,3,4,5,6,7,8,9,10};
	int[]b = {1,2,3,4,5,6,7,8,9,10};
	
	int[]c = new int[10];
	
	
	public void change(int a2[], int b2[]){
		
		for(int i=0;i<c.length;i++){
			c[i]=(a2[i]+b2[i]);
		}
	}
}
