package freshlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RATIO {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static long originz;
	static long cnt;
	static long k;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println((888*100)/100);

		int cases = Integer.parseInt(brin.readLine());
		long[] result = new long[cases];
		for (int c = 0; c < cases; c++) {
			cnt = 0;
			String[] cmp = brin.readLine().split(" ");
			long n = Long.parseLong(cmp[0]);
			long m = Long.parseLong(cmp[1]);
			// System.out.println(n);
			// System.out.println(m);
			long z = (long) Math.floor((double) m / (double) n * 100);

			// System.out.println(z);
			originz = z;
			k=z;
			result[c]=solve(n, m);
			

		}
		for (int c = 0; c < cases; c++) {
			System.out.println(result[c]);
		}

	}

	public static long solve(long n, long m) throws Exception {
	//	System.out.println("start");
		//System.out.println(Math.ceil(100));
		 long t = (long)(1 + m * 100 / n);
	//	 System.out.println(t);
		  if (t >= 100) return -1;
		  else{
			 // System.out.println((long)Math.ceil((double)(t * n - 100 * m) / (100 - t)));
		  return (long)Math.ceil((double)(t * n - 100 * m) / (100 - t));
		  }
	//	System.out.println("t===="+t);
	
	
	}
}
