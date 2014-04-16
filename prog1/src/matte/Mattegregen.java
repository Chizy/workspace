package matte;

import java.util.Arrays;

public class Mattegregen {
	public static void main(String[] args) {
		double[]x=new double[20];
		x[0]=0;
		for(int i = 0;i<19;i++){
			x[(i+1)]= (x[i]*2+1)%8;
		}
	System.out.print(Arrays.toString(x));
	}

}
