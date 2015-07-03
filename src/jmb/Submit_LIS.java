package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Submit_LIS {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] n = new int[500];

	static int[] cache = new int[501];
	static int nsize;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(brin.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for (int c = 0; c < cases; c++) {

			nsize = Integer.parseInt(brin.readLine());

			for (int i = 0; i < cache.length; i++) {
				cache[i] = -1;
			}
			String[] stmp = brin.readLine().split(" ");
			for (int i = 0; i < nsize; i++) {
				n[i] = Integer.parseInt(stmp[i]);

			}
			result.add(solve(-1));

		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}

	}

	static int solve(int start) {
		int ret = cache[start + 1];
		if (ret != -1)
			return ret;
		
		ret=1;
		for (int next = start + 1; next < nsize; next++) {
			if (start == -1)
				ret = Math.max(ret, solve(next));
			else if (n[start] < n[next])
				ret = Math.max(ret, solve(next) + 1);
		}
		cache[start + 1] = ret;
		return ret;
	}
}
