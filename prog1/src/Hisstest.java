
public class Hisstest {

	private int riktning=0;
	private int v�ning=0;
	
	
	public void k�rTill(int v){
		
		if(v�ning<v){
			riktning=1;
			
			for(int i=v�ning;i<v;i++){
				
				v�ning++;
				
				System.out.print("V�ning "+v�ning+"\n");
				System.out.print("Riktning "+riktning+"\n"+"\n");
			}
		
		}
		if(v�ning>v){
			riktning=-1;
				
			for(int i=v�ning;i<v;i=i-1){
				
				v�ning=v�ning-1;
					
				System.out.print("V�ning "+v�ning+"\n");
				System.out.print("Riktning "+riktning+"\n"+"\n");
			}
		}
	}
	
	public void stanna(){
		
		riktning=0;
		
	}
	
	public int vilkenV�ning(){
		
		return v�ning;
	}
	
	public int vilkenRiktning(){
		
		return riktning;
	}
	
	
}
