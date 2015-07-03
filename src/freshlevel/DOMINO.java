package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class DOMINO {

	public static void main(String[] args) {

		domi();

		return;

	}

	public static void domi() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if (n>=1&&n<=1000) {
			
			
			int result = 0;

			for (int i = 0; i <= n; ++i) {
				for (int k = 0; k <= i; k++) {
					result += i + k;

				}

			}
			
	//System.out.println(tmp1 + " " + cases);
			System.out.println(result);
			
			domi();
			sc.close();
		} 
			/*System.out.println("end");
			if(sresult.size()>0){
			for(int i=0;i<sresult.size();i++){
				System.out.println(sresult.get(i));
				System.out.println(nresult.get(i));
				System.out.println("");
			}*/
			sc.close();return;
			
		}
		

	}
