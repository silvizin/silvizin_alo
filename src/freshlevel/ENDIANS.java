package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class ENDIANS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = "", sc1 = "", sc2 = "", sc3 = "", sc4 = "";
		int cases = sc.nextInt();
		ArrayList mArraylist = new ArrayList<Long>();
		for (int i = 0; i < cases; i++) {

			long n = sc.nextLong();

			if (n > Integer.MAX_VALUE) {
				mArraylist.add(n);

			} else {

				s = Long.toString(n);
				int n2 = Integer.parseInt(s);
				s = "";
				// System.out.println("10진수="+n);
				
				for (int z = 0; z < Integer.numberOfLeadingZeros(n2); z++) {
					s += "0"; // 0을 빈자리 개수만큼 만들어 전진 배치}
				}
				s += Integer.toBinaryString(n2);
					 // 10진수를 2진수화하여 합치기
					//System.out.println(s);
					sc1 = s.substring(0, 8);
					sc2 = s.substring(8, 16);
					sc3 = s.substring(16, 24);
					sc4 = s.substring(24, 32);
					s = "";
					s = sc4 + sc3 + sc2 + sc1;

					long a = Long.parseLong(s, 2);
					mArraylist.add(a);
					// System.out.println("연산후="+a);
					s = "";
				}
			}
		
		for (int i = 0; i < mArraylist.size(); i++) {

			System.out.println(mArraylist.get(i));

		}

	}

}
