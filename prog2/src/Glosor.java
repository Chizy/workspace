import java.io.*;
import java.util.*;


public class Glosor {
	
	static String input;
	static int blubb;
	static List<String> sv = new LinkedList<String>();
	static List<String> eng = new LinkedList<String>();
	
	public Glosor() throws IOException{
		BufferedReader b = new BufferedReader(new FileReader("C://Users//Gym//workspace//prog2//src//Glosor.txt"));
		while(b.readLine()!=null){
			sv.add(b.readLine());
			eng.add(b.readLine());
		}
		b.close();
		this.meny();
	}
	
	public void meny() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Läggtill  2.Test  3.Visa listan  4.Avsluta");
		blubb = Integer.parseInt(b.readLine());
		
		switch(blubb){
		case 1:
			this.läggTill();
			break;
		case 2:
			this.test();
			break;
		case 3:
			this.visaLista();
			break;
		case 4:
			this.avsluta();
			break;
		}
		b.close();
	}
	
	public void läggTill() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hur många ord?");
		int blubb = Integer.parseInt(b.readLine());
		for(int k=0;k<blubb;k++){
			System.out.println("Svenska ordet");
			input = b.readLine();
			sv.add(input);
			System.out.println("Engelska ordet");
			input = b.readLine();
			eng.add(input);
		}
		this.meny();
		b.close();
	}
	
	public void test() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Svenska till Engelska");
		System.out.println("2. Engelska till Svenska");
		int blubb = Integer.parseInt(b.readLine());
		if(blubb==1){
			for(int i=0;i<sv.size();i++){
				System.out.println(sv.get(i)+" =");
				input = b.readLine();
				if(input.equalsIgnoreCase(eng.get(i))){
					System.out.println("Rätt");
				}else{
					System.out.print("Fel");
				}
			}
		}
		if(blubb==2){
			for(int i=0;i<eng.size();i++){
				System.out.println(eng.get(i)+" =");
				input = b.readLine();
				if(input.equalsIgnoreCase(sv.get(i))){
					System.out.println("Rätt");
				}else{
					System.out.print("Fel");
				}
			}
		}
		this.meny();
		b.close();
	}
	
	public void visaLista() throws IOException{
		for(int i=0;i<sv.size();i++){
			System.out.print(sv.get(i)+" = ");
			System.out.println(eng.get(i));
		}
		this.meny();
	}
	
	public void avsluta() throws IOException{
		PrintWriter p = new PrintWriter(new File("C://Users//Gym//workspace//prog2//src//Glosor.txt"));
		for(int i=0;i<sv.size();i++){
			p.println("//");
			p.println(sv.get(i));
			p.println(eng.get(i));
		}
		p.close();
		System.exit(0);
	}
	
	public static void main(String[] args) throws IOException{
		Glosor g = new Glosor();
	}
}
