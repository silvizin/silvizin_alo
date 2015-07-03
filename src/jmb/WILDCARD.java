package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WILDCARD {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(stdin.readLine());
		/*
		 * String s="he?p"; System.out.println(s.indexOf("h"));
		 */

		for (int c = 0; c < cases; c++) {
			String st = stdin.readLine();
			int n = Integer.parseInt(stdin.readLine());
			String[] w = new String[n];
			for (int wn = 0; wn < n; wn++) {

				w[wn] = stdin.readLine();

			}
			System.out.println();
			for (int wn = 0; wn < n; wn++) {

				System.out.println(w[wn]);

			}

		}

	}

}
