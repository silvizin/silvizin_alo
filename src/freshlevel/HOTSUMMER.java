package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class HOTSUMMER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> rArrayList =new ArrayList<String>();
		for(int i=0;i<cases;i++){
			
			int goal=sc.nextInt();
			
			int [] power = new int[9];
			
			for(int a=0;a<9;a++){
				power[a] = sc.nextInt();
			}
			int temp=0;
			for(int a=0;a<9;a++){
				temp+=power[a];
			}
			if(goal>=temp){
				rArrayList.add("YES");
			}else{
				rArrayList.add("NO");
			}
			temp=0;
		
		}
		
		for(int i=0;i<cases;i++){
			System.out.println(rArrayList.get(i));
		}
		
	}

}
