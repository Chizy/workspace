
public class Arraytest {
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7,8,9,10};
		int[]b = {1,2,3,4,5,6,7,8,9,10};
		int[]c = new int[10];
		for(int i=0;i<c.length;i++){
			c[i]=(a[i]+b[i]);
			System.out.println("a="+a[i]);
			System.out.println("b="+b[i]);
			System.out.println(a[i]+"+"+b[i]+"="+c[i]);
		}
	}
}
