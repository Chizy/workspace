
import java.io.*;

public class Cmdl�sning {
	public static void main(String[] args) throws IOException {
		BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("VILKET TAL!!!!!?");
	System.out.flush();
	String tal = myIn.readLine();
	double talet = (Double.parseDouble(tal))*2;
	System.out.printf("DET �R!!!!! ==== %4.1f !!!!", talet);
	
	
	}

}
