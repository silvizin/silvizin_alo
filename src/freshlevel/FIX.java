package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class FIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<cases;i++){
			
			int cnt=sc.nextInt();
			int[] ex = new int[cnt];
			for(int a=0;a<cnt;a++){
				
				ex[a]=sc.nextInt();
				
				
				
			}
			result.add(check(ex));
			
			
		}
		for(int b=0;b<result.size();b++){
			System.out.println(result.get(b));
		}
		
	}
	public static int check(int[] ex){
		int count=0;
		int[] com = new int[ex.length];
		for(int i=0;i<com.length;i++){
			com[i]=i+1;
		}
		for(int i=0;i<ex.length;i++){
			if(com[i]==ex[i]){
				count++;
			}
			
			
		}
		return count;
	}

}
