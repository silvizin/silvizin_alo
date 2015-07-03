package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class HELLOWORLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<cases;i++){
			
			String tmp1 = "Hello, ";
			String tmp2=sc.next();
			String tmp3="!";
			result.add(tmp1+tmp2+tmp3);
			
		}
		for(int i=0;i<cases;i++){
			System.out.println(result.get(i));
		}
	}

}
