package freshlevel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LECTURE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		String s = "";
		List<String> wArrayList = new ArrayList<String>();
		List<String> rArrayList = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		int k = cases;
		for (int a = 0; a < cases; a++) {

			String word = sc.next();
		

			for (int i = 0; i < word.length(); i++) {

				if (i % 2 == 0) {
					String sp = word.substring(i, i + 2);
					wArrayList.add(sp);

				}

			}
		

			Collections.sort(wArrayList);
			

			for (int i = 0; i < wArrayList.size(); i++) {

				s += wArrayList.get(i);
				
			}
			wArrayList.clear();
			
			rArrayList.add(a, s);
			s = "";

		}

		for (int i = 0; i < k; i++) {
			System.out.println(rArrayList.get(i));
		}
	}

}
