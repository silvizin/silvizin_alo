package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TRIPATHCNT {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[][] tri = new int[100][100];
	static int[][] cache;
	static int size;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] result = new int[cases];
		for (int c = 0; c < cases; c++) {

			size = sc.nextInt();

			cache = new int[size][size];
			for (int i = 0; i < size; i++) {
				for (int k = 0; k <= i; k++) {
					tri[i][k] = sc.nextInt();
				}
			}

			/*
			 * for(int i=0;i<size;i++){ for(int k=0;k<=i;k++){
			 * System.out.print(tri[i][k]+" "); } System.out.println(); }
			 */
			solve();
			/*
			 * for(int i=0;i<size;i++){ for(int k=0;k<=i;k++){
			 * System.out.print(cache[i][k]+" "); } System.out.println(); }
			 */
			Arrays.sort(cache[size - 1]);
			int a = cache[size - 1][size - 1];
			int cnt = 0;
			for (int i = 0; i < size; i++) {
				if (cache[size - 1][i] == a) {
					cnt++;
				}

			}
		//	System.out.println("cnt==" + cnt);
			if (cnt == size) {
			//	System.out.println("chk1");
				result[c] = (int) Math.pow(2, size - 1);
			} else {
				//System.out.println("chek2");
				result[c] = cnt;
			}
		}
		for (int c : result) {
			System.out.println(c);
		}

	}

	public static void solve() {
		cache[0][0] = tri[0][0];
		for (int i = 1; i < size; i++) {

			for (int k = 0; k <= i; k++) {
				if (k == 0) {
					cache[i][k] = cache[i - 1][k] + tri[i][k];
				} else if (k > 0) {

					if (cache[i - 1][k - 1] > cache[i - 1][k]) {
						cache[i][k] = cache[i - 1][k - 1] + tri[i][k];
					} else {
						cache[i][k] = cache[i - 1][k] + tri[i][k];
					}
				}
			}

		}

	}

}
