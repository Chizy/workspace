public class Testk�r {

	public static void main(String [] arg){
		int i;
		int u=0;
		Kort k1[] =new Kort[52];
		int val�renF=(int)(13*Math.random()+1);
		int f�rgenF=(int)(4*Math.random()+1);
		k1[0] = new Kort(val�renF, f�rgenF);
		Kort kk=new Kort(val�renF, f�rgenF);
		String s1 = k1[u].toString();
		String s2 = kk.toString();
		
		
		while(u<52){
			
			for(i=0;i<k1.length;i++){
				
			if(s1.equals(s2)){
				
				int val�ren=(int)(13*Math.random()+1);
				int f�rgen=(int)(4*Math.random()+1);
				kk = new Kort(val�ren, f�rgen);
				s2 = kk.toString();
				i=0;
			
			}else{
				
					k1[u]=kk;
					System.out.println((u+1)+" "+k1[u].toString());
					s1=k1[u].toString();
					u++;
					int val�ren=(int)(13*Math.random()+1);
					int f�rgen=(int)(4*Math.random()+1);
					kk = new Kort(val�ren, f�rgen);
					s2 = kk.toString();
					i=500;
					
				}
			
			}
		}
	}
}