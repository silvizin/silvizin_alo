package freshlevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ENCRYPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> wArrayList = new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<>();
		String jjak = "";
		String hol = "";
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {

			String word = sc.next();
			for (int a = 0; a < word.length(); a++) {

				map.put(a, word.substring(a, a + 1));

			}
			
			for (int a = 0; a < word.length(); a++) {

				if (a % 2 == 0) {
					jjak = jjak + map.get(a);
				}
				else{
					hol=hol+map.get(a);
					
				}
			}
		
			String result=jjak+hol;
			
			wArrayList.add(i, result);
			jjak="";
			hol="";
			result="";

		}
		for(int i=0;i<cases;i++){
			
			System.out.println(wArrayList.get(i));
		}

	}

}
