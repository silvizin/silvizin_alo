package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class DRAWRECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		int[][] a = new int[3][2];
		int[] b = new int[3];
		int x = 0, y = 0, count = 0, tmp = 0;
		ArrayList mArraylist1 = new ArrayList<Integer>();
		ArrayList mArraylist2 = new ArrayList<Integer>();
		for (int t = 0; t < cases; t++) {
			for (int i = 0; i < 3; i++) {
				for (int z = 0; z < 2; z++) {

					a[i][z] = sc.nextInt();

				}

			}
			for (int i = 0; i < 3; i++) {

				b[i] = a[i][0];

			}
			mArraylist1.add(check(b));

			for (int i = 0; i < 3; i++) {

				b[i] = a[i][1];

			}
			mArraylist2.add(check(b));

		}
		for(int i=0;i<cases;i++){
			System.out.println(mArraylist1.get(i)+" "+mArraylist2.get(i));
		}

	}

	public static int check(int[] a) {
		if (a[0] == a[2]) {
			return a[1];
		} else if (a[1] == a[2]) {

			return a[0];
		} else if (a[1] == a[0]) {
			return a[2];

		}
		return 0;

	}
}
